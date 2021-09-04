/* eslint-disable react/prop-types */
/* eslint-disable no-unused-vars */
import React from "react";
import Table from "react-bootstrap/Table";

const TableComponent = ({ tableHeader, tableBody }) => {
  return (
    <>
      {tableBody.id !== 0 && (
        <Table striped bordered hover>
          <thead>
            <tr>
              {tableHeader.map((header) => (
                <th>{header}</th>
              ))}
            </tr>
          </thead>
          <tbody>
            <tr>
              {tableBody.map((body) => (
                <td>Mark</td>
              ))}
            </tr>
          </tbody>
        </Table>
      )}
    </>
  );
};

export default TableComponent;
