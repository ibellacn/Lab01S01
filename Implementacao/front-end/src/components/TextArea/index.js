/* eslint-disable react/prop-types */
import React from "react";
import { manageClasses } from "utils/helpers/renders";

import * as S from "./styled";

const TextArea = ({error, label, name, onChange, placeholder, rows, type, value, disabled, ...attrs}) => {
  return(
    <S.WrapperTextArea>
      {label && <label htmlFor={name}>{label}</label>}
      <textarea 
        rows={rows}
        type={type}
        name={name}
        value={value}
        onChange={onChange}
        placeholder={placeholder}
        variant={manageClasses(error)}
        disabled={disabled}
        {...attrs}
      />
      <span>{error}</span>
    </S.WrapperTextArea>
  )
}

export default TextArea;