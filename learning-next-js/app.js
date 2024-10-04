// importa o express
const express = require('express');
const app = express();

// testing to see if it's working
app.get('/', (req, res) => {
    res.status(200).json({
        status: 'success',
        message: 'Woohoo! REST APIs are working',
    });
});

// 
app.listen(3000, () => {
    console.log('Server up and running');
});