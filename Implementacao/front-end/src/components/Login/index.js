/* eslint-disable react/prop-types */
/* eslint-disable react/no-unescaped-entities */
import React, { useState } from "react";
import { Formik, Form } from "formik";
import * as yup from "yup";
import Dropdown from "components/Dropdown";
import Button from "react-bootstrap/Button";
import Input from "components/Input";
import { useRouter } from "next/router";

import * as S from "./styled";

const Login = ({ title, inputs, initialDropdown, dropdownOptions, button }) => {
  const router = useRouter();
  
  const [options, setOption] = useState(initialDropdown);
  const InitialState = {
    email: "",
    password: "",
  };
  const validationSchema = yup.object({
    email: yup.string().email("E-mail inválido").required("Campo obrigatório"),
    password: yup.string().required("Campo obrigatório"),
  });

  const onSubmit = (values) => {
    console.log(values);
    if(options.type === "teacher") {
      router.push("/professores");
    }
    if(options.type === "student") {
      router.push("/alunos");
    }
    if(options.type === "secretarie") {
      router.push("secretarias");
    }
    
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
            <S.WrapperForm>
              <Dropdown items={dropdownOptions} course={options} setCourse={setOption} />
            </S.WrapperForm>
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
