/* eslint-disable react/prop-types */
import React from "react";
import Button from "react-bootstrap/Button";

import * as S from "./styled";

const TableSubjects = ({ course, subjects, title, button }) => {
  return (
    <>
      {course.id !== 0 && (
        <>
          <S.WrapperSubjects>
            <h3>{title}</h3>
            <S.ContentSubject>
              <S.ContentTable>
                {subjects.map(({ id, name, isOptional }) => (
                  <S.WrapperTable key={id}>
                    <S.Table>{name}</S.Table>
                    {isOptional ? <S.Table>não</S.Table> : <S.Table>sim</S.Table>}
                    <Button variant="success" type={button.type}>
                      {button.text}
                    </Button>
                  </S.WrapperTable>
                ))}
              </S.ContentTable>
              <S.Card />
            </S.ContentSubject>
          </S.WrapperSubjects>
          <S.WrapperButton>
            <Button variant="success" type={button.type}>
              Matrícular
            </Button>
          </S.WrapperButton>
        </>
      )}
    </>
  );
};

export default TableSubjects;
