import styled from "styled-components";

export const WrapperNavBar = styled.div`
  position: fixed;
  width: 100%;
  height: 80px;
  background: #4caf50;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0px 3%;
`;

export const LineHeader = styled.div`
  position: fixed;
  width: 100%;
  height: 10px;
  background: #357a38;
  flex-direction: row;
  z-index: 1;
`;

export const WrapperLogo = styled.div`
  width: 160px;
  text-align: center;
  font-size: 26px;
  color: #1769aa;
  cursor: pointer;
  margin-top: 5px;
  :hover {
    color: #ffffff;
  }
`;

export const WrapperMenu = styled.div`
  font-size: 21px;
  a {
    color:#1769aa;
    :hover {
      color: #ffffff;
    }
  }
`;