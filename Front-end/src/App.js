import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import MainMenu from "./components/MainMenu";
import "./styles/App.css";
import HexagonGrid from "./components/hexagongrid.";
import HexGridDemo from "./components/Grid";
function App() {
  return (
    <div className="container">
      <Router>
        <Routes>
          <Route exact path="/" element={<MainMenu />} />
          <Route path="/Grid" element={<HexGridDemo />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
