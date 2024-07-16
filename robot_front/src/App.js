import { BrowserRouter, Routes, Route } from "react-router-dom";
import Register from "./pages/Register";
import Login from "./pages/Login";
import HelloWorld from './pages/HelloWold';

function App() {
  return (
    /*
    <div className="App">
      <input name=""></input>
      <HelloWorld></HelloWorld>
    </div>
    */
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<HelloWorld />}/>
          <Route path="login" element={<Login />}/>
          <Route path="register" element={<Register />}/>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
