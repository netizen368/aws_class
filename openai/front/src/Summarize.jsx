import { useState } from "react"
import { Link } from "react-router-dom"
import {sendData} from "./AI"

function Summarize(){
	const [isLoading, setIsLoading] = useState(false)
	const [result, setResult] = useState('')
	const [form, setForm] = useState({
			text : '', 
			target_lan : 'Korean', 
			max_sentence : 3
		})
		const inputChange = (e)=>{
			const {name, value} = e.target
			setForm({...form, [name] : value})		
		}

		const formSubmit = (e)=>{
		e.preventDefault()

		if(form.text.trim() === ''){
			alert("내용을 입력하세요.")
			return
		}
		console.log(form)
		
		setIsLoading(true)
		sendData('/api/v1/ai/summarize', form, 'json', (res)=>{
			setResult(res.message)
			setIsLoading(false)
		})
	}
		
	return (
		<div>
			<Link to="/list">뒤로가기</Link>
			<h1>요약</h1>
			<form onSubmit={formSubmit}>
				<div style={{display:'flex', margin: '10px 0'}}>
					<label style={{width:'100px'}}>내용</label>
					<input style={{width:'100%'}} type="text" name="text" 
						value={form.text} onChange={inputChange}/>
				</div>
				<div style={{display:'flex', margin: '10px 0'}}>
					<label style={{width:'100px'}}>언어</label>
					<select style={{width:'100%'}} name="target_lan" onChange={inputChange}>
						<option>Korean</option>
						<option>English</option>
						<option>Japanese</option>
						<option>Chinese</option>
						<option>German</option>
						<option>Russian</option>
						<option>Indoor</option>
					</select>
				</div>
				<div style={{display:'flex', margin: '10px 0'}}>
					<label style={{width:'100px'}}>글자제한</label>
					<input style={{width:'100%'}} type="number" name="max_sentence"  value={form.max_sentence}
					 onChange={inputChange}/>
				</div>
				<button style={{width:'100%', margin: '10px 0'}} disabled={isLoading}>요약</button>
			</form>
			<h2>결과</h2>	
			<div style={{border:"1px solid black", minHeight : "300px"}}>
						{
							isLoading ? "[[번역중입니다. 잠시만 기다려주세요...]]" : result
						}
					</div>
		</div>
	)
}

export default Summarize