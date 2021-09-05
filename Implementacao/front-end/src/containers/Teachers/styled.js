import styled from "styled-components";

export const WrapperTeachers = styled.div`
  height: 780px;
  padding: 80px 0;
  margin-bottom: 80px;
`;

export const WrapperTableHeader = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  border: 1px solid;
`;

export const HeaderTable = styled.div`
  border-left: 1px solid;
  border-right: 1px solid;
  border-top: 1px solid;
  width: 50%;
  padding-left: 5px;
  font-weight: bold;
  font-size: 18px;
`;

export const ContentTeachers = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding-top: 80px;
  .dropdown {
    width: 80%;
    margin-top: 20px;
    margin-bottom: 20px;
    button {
      width: 100%;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
  }
  .dropdown-menu {
    width: 100%;
  }
`;