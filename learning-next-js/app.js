// importa o express
const express = require('express');
const app = express();

// connect router with app part 1
const authRouter = require('./route/authRoute');

// testing to see if it's working
app.get('/', (req, res) => {
    res.status(200).json({
        status: 'success',
        message: 'Woohoo! REST APIs are working',
    });
});

// connect router with app part 2
// if we request to /api/v1/auth, it'll transport to the router
// and then it'll post the 'signup' export module
// then it'll enter the authController
app.use('/api/v1/auth', authRouter);

// start listening on pool 3000 (localhost:3000)
app.listen(3000, () => {
    console.log('Server up and running');
});