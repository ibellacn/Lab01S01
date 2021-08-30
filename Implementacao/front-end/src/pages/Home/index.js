import React from "react";
import HomeContainer from "containers/Home";
import form from "utils/data/form.json";

const Home = () => {
  return (
    <>
      <HomeContainer form={form} />
    </>
  )
}

export default Home;
