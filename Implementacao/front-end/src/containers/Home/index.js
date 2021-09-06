/* eslint-disable react/prop-types */
import React from "react";
import Login from "components/Login";

const Home = ({ form }) => {
  return (
    <div>
      <Login
        title={form.title}
        inputs={form.formData}
        initialDropdown={form.initial}
        dropdownOptions={form.dropdownOptions}
        button={form.button}
      />
    </div>
  );
};

export default Home;
