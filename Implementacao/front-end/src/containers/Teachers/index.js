/* eslint-disable no-restricted-syntax */
/* eslint-disable react/prop-types */
import React, { useState } from "react";
import Dropdown from "components/Dropdown";
import TableStudents from "./TableStudents";

import * as S from "./styled";

const Teachers = ({ title, initialState, subjects, studentsTitle, tableHeader }) => {
  const [subject, setSubject] = useState(initialState);
  return (
    <S.WrapperTeachers>
      <S.ContentTeachers>
        <h1>{title}</h1>
        <Dropdown items={subjects} course={subject} setCourse={setSubject} />
        {subject.id !== 0 && (
          <div>
            <h3>{studentsTitle}</h3>
            <div>
              <S.WrapperTableHeader>
                {tableHeader.map((header) => (
                  <S.HeaderTable>{header}</S.HeaderTable>
                ))}
              </S.WrapperTableHeader>
              {subject?.students?.map((studentList) => (
                <TableStudents students={studentList} />
              ))}
            </div>
          </div>
        )}
      </S.ContentTeachers>
    </S.WrapperTeachers>
  );
};

export default Teachers;
