import Teachers from "utils/data/teachers.json";

export async function getStaticProps() {
  return {
    props: {
      title: Teachers.title,
      initialState: Teachers.initialState,
      subjects: Teachers.subjects,
      studentsTitle: Teachers.studentsTitle,
      tableHeader: Teachers.tableHeader,
    },
  };
}

export { default } from "containers/Teachers";