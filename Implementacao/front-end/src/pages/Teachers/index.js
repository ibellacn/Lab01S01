import Teachers from "utils/data/teachers.json";

export async function getStaticProps() {
  return {
    props: {
      title: Teachers.title,
    },
  };
}

export { default } from "containers/Teachers";