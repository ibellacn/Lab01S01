const Routes = require("next-routes");

const { HOME, STUDENTS } = require("../utils/constants/urls");

module.exports = Routes()
    //Home
    .add({ name: "Home", pattern: HOME, page: "Home" })
    //Students
    .add({ name: "Students", pattern: STUDENTS, page: "Students" })

