import Ask from "./Ask";
import List from "./List";
import Main from "./Main";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Translate from "./Translate";
import AdCopy from "./AdCopy";
import Summarize from "./Summarize";


function App() {
  return(
    <BrowserRouter>
      <Routes>
        <Route path="/" exact element={<Main/>} />
        <Route path="/list" exact element={<List/>} />
        <Route path="/ask" exact element={<Ask/>} />
        <Route path="/translate" exact element={<Translate/>} />
        <Route path="/ad-copy" exact element={<AdCopy/>} />
        <Route path="/summarize" exact element={<Summarize/>} />
      </Routes>
    </BrowserRouter>

  );
}

export default App;
