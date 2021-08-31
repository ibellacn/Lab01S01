const { HOME, STUDENTS, TEACHERS, SECRETARIES } = require("../utils/constants/urls");

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
  },
  {
    source: "/professores",
    destination: TEACHERS,
    permanent: true,
  },
  {
    source: "/secretarias",
    destination: SECRETARIES,
    permanent: true,
  },
];
