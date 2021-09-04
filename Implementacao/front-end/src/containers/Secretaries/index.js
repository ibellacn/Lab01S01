/* eslint-disable react/prop-types */
import React from "react";
import CalendarComponent from "components/CalendarComponent";

import * as S from "./styled";

const Secretaries = ({ title, initialCalendar, finalCalendar }) => {
  return (
    <S.WrapperSecretaries>
      <S.ContentSecretaries>
        <h1>{title}</h1>
        <S.ContentCalendar>
          <CalendarComponent title={initialCalendar.title} />
          <CalendarComponent title={finalCalendar.title} />
        </S.ContentCalendar>
      </S.ContentSecretaries>
    </S.WrapperSecretaries>
  );
};

export default Secretaries;
