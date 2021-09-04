/* eslint-disable react/prop-types */
import React from "react";
import Dropdown from "components/Dropdown";
import * as S from "./styled";

const Teachers = ({ title, data }) => {
  return (
    <S.WrapperTeachers>
      <S.ContentTeachers>
        <h1>{title}</h1>
        {/* <Dropdown items={data} /> */}
      </S.ContentTeachers>
    </S.WrapperTeachers>
  );
};

export default Teachers;
