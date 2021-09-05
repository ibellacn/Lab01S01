/* eslint-disable react/prop-types */
import React from "react";
import { manageClasses } from "utils/helpers/renders";

import * as S from "./styled";

const Input = ({error, label, name, onChange, placeholder, type, value, disabled, ...attrs}) => {
  return(
    <div>
      {label && <label htmlFor={name}>{label}</label>}
      <S.Input 
        type={type}
        name={name}
        value={value}
        onChange={onChange}
        placeholder={placeholder}
        variant={manageClasses(error)}
        disabled={disabled}
        {...attrs}
      />
      <S.Error>{error}</S.Error>
    </div>
  )
}

export default Input;