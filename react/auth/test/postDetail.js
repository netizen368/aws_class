import { useEffect } from "react";

export function PostDetail({ poNum, page }) {

	const commentArea = document.getElementById("commentArea");

	commentArea.innerHTML = "";

	if (!data.list || data.list.length === 0) {
			commentArea.innerHTML = "등록된 댓글이 없습니다.";
	} else {

			data.list.forEach(comment => {

					const html = `
							<div>
									<p>작성자 : ${comment.writer}</p>
									<p>내용 : ${comment.content}</p>
									<p>작성일 : ${comment.regDate}</p>
							</div>
					`;

					commentArea.innerHTML += html;
			});

	}

	const loadComments = async () => {
			try {
					const response = await fetch(
							`/api/v2/posts/${poNum}/comments?page=${page}`,
							{ method: "GET" }
					);

					const data = await response.json();

					console.log(data);
			} catch (e) {
					console.error(e);
			}
	};

	useEffect(() => {
			loadComments();
	}, [poNum, page]);
}