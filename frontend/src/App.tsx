import React from "react";
import logo from "./logo.svg";
import "./App.css";
import axios from "axios";
function App() {
  const SERVER_URL = `${process.env.REACT_APP_API_URL}:${process.env.REACT_APP_PORT}/`;
  console.log(SERVER_URL);
  console.log("test");
  const getHelloTest = () => {
    axios
      .get(`${SERVER_URL}users/test`)
      .then((response) => {
        console.log(response);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  getHelloTest();
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reloads.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
