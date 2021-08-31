import React, { useState } from "react";

import SearchIcon from "static/images/svg/ic-search.svg";

import * as S from "./styled";

const Search = () => {
  const [search, setSearch] = useState();
  console.log(search);
  return (
    <S.WrapperSearch>
      <form>
        <input type="text" placeholder="Procurar.." name="search" />
        <button type="button" onClick={(e) => setSearch(e.target.value)}>
          <SearchIcon />
        </button>
      </form>
    </S.WrapperSearch>
  );
};

export default Search;
