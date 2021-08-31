import styled from "styled-components";

export const WrapperSearch = styled.div`
  width: 50%;
  padding: 5px 8px;
  background: #ffffff;
  form {
    display: flex;
    justify-content: space-between;
    height: 100%;
  }
  ,
  input {
    width: 60%;
    border: none;
    border-radius: 5px;
  }
  button {
    border: none;
    border-radius: 3px;
    :hover {
      background: #ccc;
    }
  }
`;
