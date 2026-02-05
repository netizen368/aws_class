import { useEffect } from "react";

export function PostDetail({ poNum, page }) {

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