/* eslint-disable react/prop-types */
import React, { useState } from "react";
import Button from "react-bootstrap/Button";
import Dropdown from "components/Dropdown";
import Search from "components/Search";

import * as S from "./styled";

const TableSubjects = ({ course, subjects, headerTableSubject, title, items, button }) => {
  const [subject, setSubject] = useState(items[0]);
  return (
    <>
      {course.id !== 0 && (
        <>
          <S.WrapperSubjects>
            <h3>{title}</h3>
            <S.ContentSubject>
              <S.ContentTable>
                <S.SelectItems>
                  <S.WrapperDropdown>
                    <Dropdown items={items} course={subject} setCourse={setSubject} />
                  </S.WrapperDropdown>
                  <Search />
                </S.SelectItems>
                <S.WrapperTableHeader>
                  {headerTableSubject.map((header) => (
                    <S.HeaderTable>{header}</S.HeaderTable>
                  ))}
                </S.WrapperTableHeader>
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
