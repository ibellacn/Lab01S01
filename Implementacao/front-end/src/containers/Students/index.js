/* eslint-disable react/prop-types */
import React, { useState } from "react";
import Cookies from "js-cookie";
import Dropdown from "components/Dropdown";
import TableCourses from "./TableCourses ";
import TableSubjects from "./TableSubjects";


import * as S from "./styled";

const Students = ({
  title,
  initialState,
  tableHeader,
  data,
  data2,
  titleSubject,
  buttonSubject,
  headerTableSubject,
  items,
}) => {
  const [course, setCourse] = useState(initialState);
  const today = new Date();
  const valueInitial = Cookies.get("INITIAL");
  const valueFinal = Cookies.get("FINAL");
  return (
    <S.WrapperStudents>
      <S.ContentCourses>
        <h1>{title}</h1>
        {today.getTime() < valueInitial || today.getTime() > valueFinal ? (
          <div>Não Estamos no período de matrícula </div>
        ) : (
          <>
            <Dropdown items={data} course={course} setCourse={setCourse} />
            <TableCourses tableHeader={tableHeader} course={course} />
            <TableSubjects
              items={items}
              course={course}
              subjects={data2}
              title={titleSubject}
              headerTableSubject={headerTableSubject}
              button={buttonSubject}
            />
          </>
        )}
        
      </S.ContentCourses>
    </S.WrapperStudents>
  );
};

export default Students;
