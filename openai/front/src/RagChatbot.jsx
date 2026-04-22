import { Link } from "react-router-dom"
import { fetchPost, sendData } from "./AI"
import { useState } from "react"

function RagChatBot(){
	return(
		<div>
			<Link to="/list">뒤로가기</Link>
			<h1>Rag 챗봇</h1>
			<IngestPdf/>
			<hr />
			<RagAsk/>
		</div>
	)
}
// 규정집 등록(pdf만)
function IngestPdf(){
	const [file, setFile] = useState()

	const submitHandler = async (e)=>{
		e.preventDefault()
		const formData = new FormData();
		// 부트에서 받을 이름 pdfFile
		formData.append("pdfFile", file)
		console.log(file)

		// 전송
		await fetchPost("/api/v1/ai/ingest-pdf",{
			method : 'post',
			body : formData
		}, "json", (res)=>{
			alert(res.message)
		})
	}
	
	const fileChage = (e)=>{
		setFile(e.target.files[0])	

		
	}
	return (
		<form onSubmit={submitHandler}>
			<input type="file" name="file" accept=".pdf" onChange={fileChage}/>
			<button>정규집 등록</button>
		</form> 
	)
}
// 규정집에 있는 내용 질문
function RagAsk(){
	const [result, setResult] = useState('')
	const [form, setForm] = useState({text : ''})

	const inputChange = (e)=>{
		const {name, value} = e.target
		setForm({...form, [name] : value})		
	}
	const formSubmit = (e)=>{
		e.preventDefault()

		if(form.text.trim() === ''){
			alert("질문을 입력하세요.")
			return
		}
		sendData('/api/v1/ai/rag-chatbot', form, 'json', (res)=>{
			setResult(res.message)
		})
	}
	return(
		<div>
			<form onSubmit={formSubmit}>
					<div style={{display:'flex'}}>
					<input style={{width:'100%', minHeight : '200px'}}  type="text" name="text"  onChange={inputChange}/>
				</div>
					<button style={{width:'100%'}}>질문</button>
			</form>
			<h2>답변</h2>
			<pre style={{border : '1px solid black', minHeight : '200px'}}>
					{result}
			</pre>
		</div>
	)
}

export default RagChatBot