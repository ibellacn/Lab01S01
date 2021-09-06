/* eslint-disable react/prop-types */
import React, { useState, useEffect } from "react";
import Cookies from "js-cookie";
import Calendar from "react-calendar";

import * as S from "./styled";

const CalendarComponent = ({ title, stateCalendar }) => {
  const [value, onChange] = useState(new Date());

  useEffect(() => {
    if(stateCalendar === "initial") {
      Cookies.set("INITIAL", value.getTime(), { expires: 360 });
    } 
    if(stateCalendar === "final") {
      Cookies.set("FINAL", value.getTime(), { expires: 360 });
    }
  },[value, onChange])

  return (
    <S.WrapperCalendar>
      <h3>{title}</h3>
      <Calendar onChange={onChange} value={value} />
      <S.CardDate>{value.toLocaleDateString()}</S.CardDate>
    </S.WrapperCalendar>
  );
};

export default CalendarComponent;
