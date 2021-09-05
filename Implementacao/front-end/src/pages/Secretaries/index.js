import Secretaries from "utils/data/secretaries.json";
import FormUser from "utils/data/user.json";

export async function getStaticProps() {
  return {
    props: {
      title: Secretaries.title,
      initialCalendar: Secretaries.initialCalendar,
      finalCalendar: Secretaries.finalCalendar,
      resgiterOptions: {
        initial: Secretaries.resgisterInitial,
        resgister: Secretaries.resgister
      },
      formTeacher: FormUser.teacher,
      formStudent: FormUser.student,
    }
  }
}

export { default } from "containers/Secretaries";