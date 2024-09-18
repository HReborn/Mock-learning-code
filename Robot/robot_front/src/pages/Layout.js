import { Outlet, Link } from "react-router-dom";

// As specified on ./src/index.js, this file will be the home page. From here, the user can access the other pages. To enforce multi-page, this template must continue for the foreseeable future.
function Layout() {
    return (
        <>
            <nav>
                <ul>
                    <li>
                        <Link to="/hello-world">Hello World!!</Link>
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
    )
}

export default Layout;