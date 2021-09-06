/* eslint-disable jsx-a11y/label-has-associated-control */
import React from "react";
import { Formik, Field, Form } from "formik";
import { Button } from "react-bootstrap";

import * as S from "./styled";

const Subjects = () => {
  const InitialState = {
    name: "",
    toggle: false,
  };
  return (
    <Formik
      initialValues={InitialState}
      validate={(values) => {
        const errors = {};
        if (!values.name) {
          errors.email = "Required";
        }
        return errors;
      }}
      onSubmit={(values, { setSubmitting }) => {
        setTimeout(() => {
          (async () => {
            await fetch(
              "http://localhost:8080/subject/",
              {
                method: "POST",
                headers: {
                  "Accept": "*/*",
                  "Content-Type": "application/json; charset=utf-8; application/*+json",
                },
                body: JSON.stringify({
                  name: values.name,
                  isOptional: values.toggle,
                }),
              },
            );
          })();
          setSubmitting(false);
        }, 500);
      }}
    >
      {({ values, errors, touched, handleChange, handleBlur, handleSubmit, isSubmitting }) => (
        <Form onSubmit={handleSubmit}>
          <S.WrapperForm>
            <input
              type="text"
              name="name"
              onChange={handleChange}
              onBlur={handleBlur}
              value={values.name}
              placeholder="Preencha com o nome da disciplina"
            />
            {errors.name && touched.name && errors.name}
            <S.Label>
              <Field type="checkbox" name="toggle" />
              <span>Habilite se a matéria for opcional</span>
            </S.Label>
            <S.WrapperButton>
              <Button variant="success" type="submit" disabled={isSubmitting}>
                Cadastrar
              </Button>
            </S.WrapperButton>
          </S.WrapperForm>
        </Form>
      )}
    </Formik>
  );
};

export default Subjects;
