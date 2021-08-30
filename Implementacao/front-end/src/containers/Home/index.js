/* eslint-disable react/prop-types */
import React from "react";
import Login from "components/Login";

const Home = ({ form }) => {
  return (
    <div>
      <Login title={form.title} inputs={form.formData} button={form.button} />
    </div>
  );
};

export default Home;
