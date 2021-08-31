import styled from "styled-components";

export const WrapperSubjects = styled.div`
  width: 80%;
  margin-top: 20px;
  h3 {
    font-size: 21px;
    text-align: center;
    margin-bottom: 20px;
    font-weight: bold;
  }
`;

export const ContentSubject = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: space-between;
`;

export const WrapperDropdown = styled.div`
  width: 37%;
`;

export const SelectItems = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
`;

export const ContentTable = styled.div`
  display: flex;
  flex-direction: column;
  width: 70%;
`;

export const WrapperTableHeader = styled.div`
  width: 100%;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  border: 1px solid;
`;

export const HeaderTable = styled.div`
  border-left: 1px solid;
  border-right: 1px solid;
  border-top: 1px solid;
  width: 100%;
  padding-left: 5px;
  font-weight: bold;
  font-size: 18px;
  :nth-child(1) {
    max-width: 43%;
  }
  :nth-child(2) {
    max-width: 43%;
  }
  :nth-child(3) {
    max-width: 18%;
  }
`;

export const WrapperTable = styled.div`
  width: 100%;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  border: 1px solid;
  button {
    margin: 10px;
  }
`;

export const Table = styled.div`
  border: 1px solid;
  width: 45%;
  padding: 5px;
  display: flex;
  align-items: center;
`;

export const Card = styled.div`
  width: 40%;
  background-color: blanchedalmond;
  border-radius: 3px;
  box-shadow: 10px 5px 5px black;
  margin-left: 10px;
`;

export const WrapperButton = styled.div`
  margin-top: 20px;
  width: 30%;
  button {
    width: 100%;
  }
`;
