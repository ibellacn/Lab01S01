const Routes = require("next-routes");

const { HOME, STUDENTS, TEACHERS, SECRETARIES } = require("../utils/constants/urls");

module.exports = Routes()
  // Home
  .add({ name: "Home", pattern: HOME, page: "Home" })
  // Students
  .add({ name: "Students", pattern: STUDENTS, page: "Students" })
  // teaches
  .add({ name: "Teachers", pattern: TEACHERS, page: "Teachers" })
  // secretaries
  .add({ name: "Secretaries", pattern: SECRETARIES, page: "Secretaries" });
