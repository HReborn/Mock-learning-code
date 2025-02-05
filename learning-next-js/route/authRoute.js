const { signup } = require('../controller/authController');

const router = require('express').Router();

// it is importing the module signup that we exported
// at this module we have a simple response to check if it's working
router.route('/signup').post(signup)

module.exports = router;