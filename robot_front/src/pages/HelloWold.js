import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { BASE_API_URL } from '../properties';

function HelloWorld() {
    const [message, setMessage] = useState('');

    useEffect(() => {
        axios.get(BASE_API_URL+'/robot/hello-world/')
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

export default HelloWorld;