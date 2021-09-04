import Secretaries from "utils/data/secretaries.json";

export async function getStaticProps() {
  return {
    props: {
      title: Secretaries.title,
      initialCalendar: Secretaries.initialCalendar,
      finalCalendar: Secretaries.finalCalendar
    }
  }
}

export { default } from "containers/Secretaries";