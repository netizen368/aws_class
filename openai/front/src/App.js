import Ask from "./Ask.jsx";
import List from "./List";
import Main from "./Main";
import { BrowserRouter, Route, Routes } from "react-router-dom";


function App() {
  return(
    <BrowserRouter>
      <Routes>
        <Route path="/" exact element={<Main/>} />
        <Route path="/list" exact element={<List/>} />
        <Route path="/ask" exact element={<Ask/>} />
      </Routes>
    </BrowserRouter>

  );
}

export default App;
