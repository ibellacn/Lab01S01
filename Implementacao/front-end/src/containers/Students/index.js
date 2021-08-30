/* eslint-disable react/prop-types */
import React, { useState } from "react";
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
}) => {
  const [course, setCourse] = useState(initialState);
  return (
    <S.WrapperStudents>
      <S.ContentCourses>
        <h1>{title}</h1>
        <Dropdown items={data} course={course} setCourse={setCourse} />
        <TableCourses tableHeader={tableHeader} course={course} />
        <TableSubjects
          course={course}
          subjects={data2}
          title={titleSubject}
          button={buttonSubject}
        />
      </S.ContentCourses>
    </S.WrapperStudents>
  );
};

export default Students;
