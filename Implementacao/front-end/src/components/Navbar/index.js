/* eslint-disable react/prop-types */
import React from "react";
import Link from "next/link";
import Nav from "react-bootstrap/Nav";
import * as S from "./styled";

const Navbar = ({ logo, items }) => {
  return (
    <>
      <S.LineHeader />
      <S.WrapperNavBar>
        <S.WrapperLogo>
          <Link href="/" className="text-center mt-4 mb-4">
            {logo}
          </Link>
        </S.WrapperLogo>
        <Nav className="justify-content-end" activeKey="/home">
          {items.map(({ id, name, link }) => (
            <S.WrapperMenu>
              <Nav.Item key={id}>
                <Nav.Link href={link}>{name}</Nav.Link>
              </Nav.Item>
            </S.WrapperMenu>
          ))}
        </Nav>
      </S.WrapperNavBar>
    </>
  );
};

export default Navbar;
