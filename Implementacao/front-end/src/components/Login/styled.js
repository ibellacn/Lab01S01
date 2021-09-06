import styled from "styled-components";

export const WrapperLogin = styled.div`
  width: 100%;
  height: 790px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  h2 {
    width: 100%;
    font-size: 16px;
    font-weight: bold;
    text-align: center;
    color: #1769aa;
  }
  form {
    width: 100%;
    max-width: 290px;
  }
  button {
    width: 100%;
    max-width: 290px;
  }
`;

export const WrapperForm = styled.div`
  .dropdown {
    width: 100%;
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
