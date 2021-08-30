/* eslint-disable react/prop-types */
/* eslint-disable react/no-unescaped-entities */
import React from "react";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";

import * as S from "./styled";

const Login = ({ title, inputs, button }) => {
  return (
    <S.WrapperLogin>
      <h2>{title}</h2>
      <Form>
        {inputs.map(({ id, text, type, placeholder }) => (
          <Form.Group className="mb-3" controlId={id}>
            <Form.Label>{text}</Form.Label>
            <Form.Control type={type} placeholder={placeholder} />
          </Form.Group>
        ))}
        <Button variant="success" type={button.typeButton}>
          {button.text}
        </Button>
      </Form>
    </S.WrapperLogin>
  );
};

export default Login;
