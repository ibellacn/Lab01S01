/* eslint-disable react/prop-types */
import React from "react";

import * as S from "./styled";

const TableCourses = ({ tableHeader, course }) => {
  return (
    <>
      {course.id !== 0 && (
        <>
          <S.WrapperTableHeader>
            {tableHeader.map((header) => (
              <S.HeaderTable>{header}</S.HeaderTable>
            ))}
          </S.WrapperTableHeader>

          <S.WrapperTable>
            <S.Table>{course.id}</S.Table>
            <S.Table>{course.name}</S.Table>
            <S.Table>{course.credits}</S.Table>
          </S.WrapperTable>
        </>
      )}
    </>
  );
};

export default TableCourses ;