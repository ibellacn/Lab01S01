/* eslint-disable react/prop-types */
/* eslint-disable no-nested-ternary */
/* eslint-disable no-alert */
import React from "react";
import { Formik, Form } from "formik";
import { Button } from "react-bootstrap";
import Input from "components/Input";
import TextArea from "components/TextArea";
import InputMask from "react-input-mask";
import * as yup from "yup";

const FormUser = ({ types, formData, buttonData }) => {
  const InitialStateTeacher = {
    account: "",
    email: "",
    password: "",
    type: types,
    cpf: "",
    text: "",
  };

  const InitialStateStudent = {
    account: "",
    email: "",
    password: "",
    type: types,
    cpf: "",
  };

  const validationSchema = yup.object({
    account: yup.string().required("Campo obrigatório"),
    email: yup.string().email("E-mail inválido").required("Campo obrigatório"),
    password: yup.string().required("Campo obrigatório"),
    cpf: yup.string().required("Campo obrigatório"),
    text: yup.string().notRequired(),
  });

  const onSubmit = (values) => {
    setTimeout(() => {
      if(types === "Student") {
        (async () => {
          await fetch(
            "http://localhost:8080/user/",
            {
              method: "POST",
              headers: {
                "Accept": "*/*",
                "Content-Type": "application/json; charset=utf-8; application/*+json",
              },
              body: JSON.stringify({
                name: values.account,
                email: values.email,
                password: values.password,
                type: values.type,
                cpf: values.cpf,
              }),
            },
          );
        })();
      } else {
        (async () => {
          await fetch(
            "http://localhost:8080/user/",
            {
              method: "POST",
              headers: {
                "Accept": "*/*",
                "Content-Type": "application/json; charset=utf-8; application/*+json",
              },
              body: JSON.stringify({
                name: values.account,
                email: values.email,
                password: values.password,
                type: values.type,
                info: values.text,
                cpf: values.cpf,
              }),
            },
          );
        })();
      }
    },500)
  };

  return (
    <Formik
      initialValues={types === "Student" ? InitialStateStudent : InitialStateTeacher}
      validationSchema={validationSchema}
      onSubmit={onSubmit}
    >
      {({ values, errors, handleChange }) => (
        <Form>
          {formData.map(({ type, id, field }) => (
            <div key={id}>
              <Input
                type={type}
                name={id}
                error={
                  id === "account"
                    ? errors.account
                    : id === "email"
                    ? errors.email
                    : errors.password
                }
                onChange={handleChange}
                value={
                  id === "account"
                    ? values.account
                    : id === "email"
                    ? values.email
                    : values.password
                }
                placeholder={field}
              />
            </div>
          ))}
          <InputMask
            type="text"
            name="cpf"
            mask="999.999.999-99"
            onChange={handleChange}
            value={values.cpf}
            placeholder="CPF"
          >
            {(inputProps) => <Input error={errors.cpf} {...inputProps} />}
          </InputMask>
          {types === "Teacher" && (
            <TextArea
              label="Informações complementares do professor"
              onChange={handleChange}
              name="text"
              value={values.text}
              error={errors.text}
              rows={6}
            />
          )}
          <Button variant="success" type="submit">
            {buttonData?.text}
          </Button>
        </Form>
      )}
    </Formik>
  );
};

export default FormUser;
