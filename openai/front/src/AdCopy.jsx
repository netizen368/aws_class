import { Link } from "react-router-dom"

function AdCopy(){
	return(
		<div>
			<Link to="/list">뒤로가기</Link>
			<h1>광고 문구 제작</h1>
			<form>
				<div>
					<input name="product" value="product"></input>
					<input name="feature" value="feature"></input>
					<input name="target" value="target"></input>
					<input name="temp" value="temp"></input>
					<input name="count" value="count"></input>
				</div>
				<button>버튼</button>
			</form>
		</div>
	)
}

export default AdCopy