/* eslint-disable react/prop-types */
import React from "react";
import * as S from "./styled";

const TableStudents = ({ students }) => {
  return (
    <>
      {students.id !== 0 && (
        <>
          <S.WrapperTable>
            <S.Table>{students.id}</S.Table>
            <S.Table>{students.name}</S.Table>
          </S.WrapperTable>
        </>
      )}
    </>
  );
};

export default TableStudents;