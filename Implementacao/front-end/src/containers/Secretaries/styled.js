import styled from "styled-components";

export const WrapperSecretaries = styled.div`
  height: 780px;
  padding: 80px 0;
  margin-bottom: 80px;
`;

export const ContentSecretaries = styled.div`
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

export const ContentCalendar = styled.div`
  width: 100%;
  max-width: 870px;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  margin: 80px 0;
`;
