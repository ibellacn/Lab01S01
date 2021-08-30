import Students from "utils/data/students.json";

export async function getStaticProps() {
  const res = await fetch("http://localhost:8080/course");
  const data = await res.json();

  if (!data) {
    return {
      notFound: true,
    }
  }

  const res2 = await fetch("http://localhost:8080/subject");
  const data2 = await res2.json();

  if (!data2) {
    return {
      notFound: true,
    }
  }

  return {
    props: {
      title: Students.title,
      initialState: Students.initialState,
      tableHeader: Students.tableHeader,
      data,
      titleSubject: Students.subjectsOptions.title,
      buttonSubject: Students.subjectsOptions.button,
      data2
    },
  }
}

export { default } from "containers/Students";