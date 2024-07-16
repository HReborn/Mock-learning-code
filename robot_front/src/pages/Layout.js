import { Outlet, Link } from "react-router-dom";

function Layout() {
    <>
        <nav>
            <ul>
                <li>
                    <Link to="/">Hello Wold!!</Link>
                </li>
                <li>
                    <Link to="/login">Login</Link>
                </li>
                <li>
                    <Link to="/register">Register</Link>
                </li>
            </ul>
        </nav>
        
        <Outlet />
    </>
}