import React from "react";
import PropTypes from "prop-types";

import Navbar from "components/Navbar";

import header from "utils/data/header.json";

import "bootstrap/dist/css/bootstrap.min.css";
import "react-calendar/dist/Calendar.css";
import GlobalStyle from "utils/style/globalStyle";

const App = ({ Component, pageProps }) => {
  return (
    <>
      <GlobalStyle />
      <Navbar logo={header.logo} items={header.links} />
      <Component {...pageProps} />
    </>
  )
}

App.propTypes = {
  Component: PropTypes.oneOfType([PropTypes.node, PropTypes.func, PropTypes.object]).isRequired,
  pageProps: PropTypes.object.isRequired,
};

export default App;
