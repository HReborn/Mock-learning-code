import React, { useState, useEffect }from 'react';
import axios from 'axios';

function Login() {
    const [message, setMessage] = useState('');

    useEffect(() => {
        axios.get('http://localhost:8000/robot/login/')
        .then(response => {
            setMessage(response.data.message);
        })
        .catch(error => {
            console.log(error);
        });
    }, []);

    return (
        <div>
            <p>{message}</p>
        </div>
    )
}

export default Login;