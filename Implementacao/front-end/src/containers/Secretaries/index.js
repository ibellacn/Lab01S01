/* eslint-disable react/prop-types */
import React from "react";
import Calendar from "components/Calendar";

import * as S from "./styled";

const Secretaries = () => {
  return (
    <S.WrapperSecretaries>
      <S.ContentSecretaries>
        <h1>Lucas</h1>
        <Calendar />
      </S.ContentSecretaries>
    </S.WrapperSecretaries>
  );
};

export default Secretaries;
