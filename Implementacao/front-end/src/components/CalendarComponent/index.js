/* eslint-disable react/prop-types */
import React, { useState } from "react";
import Calendar from "react-calendar";
import * as S from "./styled";
// import Cookies from "js-cookie";

const CalendarComponent = ({ title }) => {
  const [value, onChange] = useState(new Date());

  return (
    <S.WrapperCalendar>
      <h3>{title}</h3>
      <Calendar onChange={onChange} value={value} />
      <S.CardDate>{value.toLocaleDateString()}</S.CardDate>
    </S.WrapperCalendar>
  );
};

export default CalendarComponent;
