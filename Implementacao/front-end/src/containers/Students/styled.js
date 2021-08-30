import styled from "styled-components";

export const WrapperStudents = styled.div`
  height: 780px;
  padding-top: 80px;
`;

export const ContentCourses = styled.div`
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
    width: 100%;;
  }
`;