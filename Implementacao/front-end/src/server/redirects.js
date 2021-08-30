const { HOME, STUDENTS } = require("../utils/constants/urls");

module.exports = [
  {
    source: "/",
    destination: HOME,
    permanent: true,
  },
  {
    source: "/alunos",
    destination: STUDENTS,
    permanent: true,
  }
];