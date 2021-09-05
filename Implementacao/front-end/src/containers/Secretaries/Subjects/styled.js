import styled from "styled-components";

export const WrapperForm = styled.div`
  display: flex;
  justify-content: space-between;
  flex-direction: column;
  input {
    padding: 10px;
    border: none;
    border-radius: 5px;
    margin-bottom: 20px;
  }
`;

export const Label = styled.label`
  margin-left: 5px;
  font-weight: bold;
  span {
    margin-left: 8px;
  }
`;

export const WrapperButton = styled.div`
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  button {
    width: 100%;
    max-width: 300px;
  }
`;