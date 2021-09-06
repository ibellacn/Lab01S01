/* eslint-disable react/prop-types */
import React from "react";
import { Formik, Form } from "formik";

import SearchIcon from "static/images/svg/ic-search.svg";

import * as S from "./styled";

const Search = ({ onSubmit, searchError }) => {
  const InitialState = {
    name: "",
  };

  return (
    <>
      <Formik
        initialValues={InitialState}
        onSubmit={onSubmit}
      >
        {({values, handleChange, handleBlur }) => (
          <S.WrapperSearch>
            <Form>
              <input
                type="text"
                name="name"
                onChange={handleChange}
                onBlur={handleBlur}
                value={values.name}
                placeholder="Procurar . . ."
              />
              <button type="submit">
                <SearchIcon />
              </button>
            </Form>
          </S.WrapperSearch>
        )}
      </Formik>
      <p>{searchError}</p>
    </>
  );
};

export default Search;
