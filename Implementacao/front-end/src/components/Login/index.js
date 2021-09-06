/* eslint-disable react/prop-types */
/* eslint-disable react/no-unescaped-entities */
import React from "react";
import { Formik, Form } from "formik";
import * as yup from "yup";
import Button from "react-bootstrap/Button";
import Input from "components/Input";

import * as S from "./styled";

const Login = ({ title, inputs, button }) => {
  const InitialState = {
    email: "",
    password: "",
    type: "",
  };

  const validationSchema = yup.object({
    email: yup.string().email("E-mail inválido").required("Campo obrigatório"),
    password: yup.string().required("Campo obrigatório"),
    type: "",
  });

  const onSubmit = (values) => {
    console.log(values);
  };

  return (
    <S.WrapperLogin>
      <h2>{title}</h2>
      <Formik initialValues={InitialState} validationSchema={validationSchema} onSubmit={onSubmit}>
        {({ values, errors, handleChange }) => (
          <Form>
            {inputs.map(({ id, type, placeholder }) => (
              <div key={id}>
                <Input
                  type={type}
                  name={type}
                  placeholder={placeholder}
                  onChange={handleChange}
                  error={type === "email" ? errors.email : errors.password}
                  value={type === "email" ? values.email : values.password}
                />
              </div>
            ))}
            <Button variant="success" type={button.typeButton}>
              {button.text}
            </Button>
          </Form>
        )}
      </Formik>
    </S.WrapperLogin>
  );
};

export default Login;
