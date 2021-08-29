export const listAll = async (query) => {
  let endpoint = `http://localhost:8080/${query}`;
  await fetch(endpoint, {
    method: "get",
  })
    .then((response) => {
      console.log(response)
    })
    .catch((err) => {
      console.error(err);
    });
};

export const listOne = async (query, id) => {
  let endpoint = `http://localhost:8080/${query}/${id}`;
  await fetch(endpoint, {
    method: "get",
  })
    .then((response) => {
      console.log(response)
    })
    .catch((err) => {
      console.error(err);
    });
};

export const DeleteOnList = async (query, id) => {
  let endpoint = `http://localhost:8080/${query}/${id}`;
  await fetch(endpoint, {
    method: "delete",
  })
    .then((response) => {
      console.log(response)
    })
    .catch((err) => {
      console.error(err);
    });
};

export const login = (email, password) => {
  return new Promise((resolve, reject) => {
    let endpoint = `http://localhost:8080/login/${email}/${password}`;
    fetch(endpoint, {
      method: "post",
      headers: {
        "Content-Type": "application/json",
        "Accept": "application/json",
      },
      body: JSON.stringify({
        email: email,
        password: password
      }),
    })
      .then((response) => {
        resolve(response); //ok
        reject(response); //errado
      })
      .catch((err) => {
        console.error(err);
      });
  })
};

export const logOut = (id) => {
  return new Promise((resolve, reject) => {
    let endpoint = `http://localhost:8080/logout/${id}`;
    fetch(endpoint, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
        "Accept": "application/json",
      },
    })
      .then(response => {
        // if (e.ok) {
          resolve(response);
        // } else {
          reject(response);
        // }
      })
      .catch(response => console.log("error::", response));
  });
};


