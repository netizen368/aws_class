import { useState } from "react";

const EX_ITEMS = [
  {label : "예제1", istOpen : false, el: <Ex1/>},
  {label : "예제2", istOpen : false, el: <Ex2/>},
  {label : "예제3", istOpen : false, el: <Ex3/>}
]

function App2() {
   return (
      <div className="App2">
         <Main/>
      </div>
   );
}

function Main() {
   let [items, setItems] = useState(EX_ITEMS);

   const chageEx = (label)=>{
      const updateEx = items.map(item=>{
         if(item.label === label){
            return {...item, istOpen : !item.istOpen};
         }
         return {...item, istOpen : false}
      });
      setItems(updateEx);
      
   }
   
   return (
      <div className="App">
         <h1>메인</h1>
         <div>
          {items.map(item=>{
            return(
               <button onClick={()=>chageEx(item.label)}>
                  {item.label} : {item.istOpen ? "접기" : "보기"}
               </button> )
          })}
         </div>
         <div>
          {items.map(item=>{ return item.istOpen ? item.el : null })}
         </div>
      </div>
   )
}

function Ex1(){
   let[num, SetNum] = useState(0)

   return (
      <div>
            <h1>예제1</h1>
            <button onClick={()=>SetNum(num-1)}>-</button>
            <input type="text" value={num} readOnly={true}/>
            <button onClick={()=>SetNum(num+1)}>+</button>
      </div>
   );
}

//Ex2를 생성해서 Main에서 호출하세요
//Ex2는 input태그와 h1태그로 구성
//input태그에 값을 입력하면 h1태그에 출력

function Ex2(){
   let [input, SetInput] = useState("");

   const inputChange=(e)=>{
      SetInput(e.target.value);
   }

   return(
      <div>
         <h1>예제2</h1>
         <input type="text" onChange={inputChange}/>
         <h2>{input}</h2>
      </div>
   );
}

function Ex3(){
   return <div><h1>예제3</h1></div>
}

export default App2;
