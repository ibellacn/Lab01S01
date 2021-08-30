/* eslint-disable react/prop-types */
import React from "react";
import Dropdown from "react-bootstrap/Dropdown";

const DropdownComponent = ({ items, course, setCourse }) => {
  return (
    <>
      <Dropdown>
        <Dropdown.Toggle variant="success" id="dropdown-basic">
          {course.name}
        </Dropdown.Toggle>

        <Dropdown.Menu>
          {items?.map((item) => (
            <Dropdown.Item onClick={() => setCourse(item)}>{item.name}</Dropdown.Item>
          ))}
        </Dropdown.Menu>
      </Dropdown>
    </>
  );
};

export default DropdownComponent;
