import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Layout from "./pages/Layout";
import NoPage from "./pages/NoPage";
import Register from "./pages/Register";
import Login from "./pages/Login";
import HelloWorld from './pages/HelloWold';

// The routes below indicate the user's URL to access the app. If it's not mapped below, the user can't access the page.
// The domain URL is defined at ./src/properties.js
export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="hello-world" element={<HelloWorld />}/>
          <Route path="login" element={<Login />}/>
          <Route path="register" element={<Register />}/>
          <Route path="*" element={<NoPage />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <App />
);