const signup = (req, res, next) => {
    res.json({
        status: 'sucess',
        message: 'Signup route is working',
    });
};

module.exports = { signup };