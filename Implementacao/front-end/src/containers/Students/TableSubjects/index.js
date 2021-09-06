/* eslint-disable react/prop-types */
import React, { useState } from "react";
import Button from "react-bootstrap/Button";
import Dropdown from "components/Dropdown";
import Search from "components/Search";
import RemoveIcon from "static/images/svg/ic-close.svg";

import * as S from "./styled";

const TableSubjects = ({ course, subjects, headerTableSubject, title, items, button }) => {
  const [subject, setSubject] = useState(items[0]);
  const [itemSubjectIsNotOptional, setItemSubjectIsNotOptional] = useState([]);
  const [newItemSubjectIsNotOptional, setNewItemSubjectIsNotOptional] = useState([]);
  const [itemSubjectIsOptional, setItemSubjectIsOptional] = useState([]);
  const [newItemSubjectIsOptional, setNewItemSubjectIsOptional] = useState([]);

  const addToCart = (item) => {
    if (!item.isOptional) {
      setItemSubjectIsNotOptional((currentCart) => [...currentCart, item]);
      if (itemSubjectIsNotOptional !== 0) {
        const uniqueInCartIsNotOptional = new Set();
        itemSubjectIsNotOptional.forEach((itemSubIsNotOptional) => {
          uniqueInCartIsNotOptional.add(itemSubIsNotOptional);
        });
        if(newItemSubjectIsNotOptional <= 4) {
          setNewItemSubjectIsNotOptional([...uniqueInCartIsNotOptional.values()]);
        }
        
      }
    }

    if (item.isOptional) {
      setItemSubjectIsOptional((currentCart) => [...currentCart, item]);
      if (itemSubjectIsOptional !== 0) {
        const uniqueInCartIsOptional = new Set();
        itemSubjectIsOptional.forEach((itemSubIsOptional) => {
          uniqueInCartIsOptional.add(itemSubIsOptional);
        });
        if(newItemSubjectIsOptional <= 2) {
          setNewItemSubjectIsOptional([...uniqueInCartIsOptional.values()]);
        }
      }
    }
  };

  const removeFromCart = (item) => {
    if (!item.isOptional) {
      setNewItemSubjectIsNotOptional((currentCart) => {
        const indexOfItemToRemove = currentCart.findIndex((cartItem) => cartItem.id === item.id);
        if (indexOfItemToRemove === -1) {
          return currentCart;
        }
  
        return [
          ...currentCart.slice(0, indexOfItemToRemove),
          ...currentCart.slice(indexOfItemToRemove + 1),
        ];
      });
    };

    if (item.isOptional) {
      setNewItemSubjectIsOptional((currentCart) => {
        const indexOfItemToRemove = currentCart.findIndex((cartItem) => cartItem.id === item.id);
        if (indexOfItemToRemove === -1) {
          return currentCart;
        }
  
        return [
          ...currentCart.slice(0, indexOfItemToRemove),
          ...currentCart.slice(indexOfItemToRemove + 1),
        ];
      });
    };
  };

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
                {subject.id === 2 && (
                  <>
                    <S.WrapperTableHeader>
                      {headerTableSubject.map((header) => (
                        <S.HeaderTable>{header}</S.HeaderTable>
                      ))}
                    </S.WrapperTableHeader>
                    {subjects.map((itemSub) => (
                      <S.WrapperTable key={itemSub.id}>
                        <S.Table>{itemSub.name}</S.Table>
                        {itemSub.isOptional ? <S.Table>não</S.Table> : <S.Table>sim</S.Table>}
                        <Button
                          variant="success"
                          type={button.type}
                          onClick={() => addToCart(itemSub)}
                        >
                          {button.text}
                        </Button>
                      </S.WrapperTable>
                    ))}
                  </>
                )}
              </S.ContentTable>
              <S.WrapperCard>
                <S.Card>
                  <p>Obrigatórias</p>
                  {newItemSubjectIsNotOptional?.map((IsNotOptional) => (
                    <S.ItemsCard>
                      <span>{IsNotOptional.name}</span>
                      <button type="button" onClick={() => removeFromCart(IsNotOptional)}>
                        <RemoveIcon />
                      </button>
                      
                    </S.ItemsCard>
                  ))}
                </S.Card>
                <S.Card>
                  <p>Opcionais</p>
                  {newItemSubjectIsOptional?.map((IsOptional) => (
                    <S.ItemsCard>
                      <span>{IsOptional.name}</span>
                      <button type="button" onClick={() => removeFromCart(IsOptional)}>
                        <RemoveIcon />
                      </button>
                    </S.ItemsCard>
                  ))}
                </S.Card>
              </S.WrapperCard>
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
