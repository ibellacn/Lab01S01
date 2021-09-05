/* eslint-disable react/prop-types */
import React, { useState } from "react";
import CalendarComponent from "components/CalendarComponent";
import Dropdown from "components/Dropdown";
import Subjects from "./Subjects";
import FormUser from "./FormUser";

import * as S from "./styled";

const Secretaries = ({
  title,
  initialCalendar,
  finalCalendar,
  resgiterOptions,
  formTeacher,
  formStudent,
}) => {
  const [options, setOption] = useState(resgiterOptions.initial);
  return (
    <S.WrapperSecretaries>
      <S.ContentSecretaries>
        <h1>{title}</h1>
        <S.ContentCalendar>
          <CalendarComponent title={initialCalendar.title} stateCalendar="initial" />
          <CalendarComponent title={finalCalendar.title} stateCalendar="final" />
        </S.ContentCalendar>
        <S.WrapperDropdown>
          <Dropdown items={resgiterOptions.resgister} course={options} setCourse={setOption} />
        </S.WrapperDropdown>
        <S.WrapperSection>
          {options.id === 1 && <Subjects />}
          {options.id === 2 && (
            <FormUser
              types={formTeacher.types}
              formData={formTeacher.form}
              buttonData={formTeacher.button}
            />
          )}
          {options.id === 3 && (
            <FormUser
              types={formStudent.types}
              formData={formStudent.form}
              buttonData={formStudent.button}
            />
          )}
        </S.WrapperSection>
      </S.ContentSecretaries>
    </S.WrapperSecretaries>
  );
};

export default Secretaries;
