import React, { useState, useEffect } from "react";
import HexagonGrid from "./hexagongrid.";
import times from "lodash/times";
import { useNavigate } from "react-router-dom";
import "./HexGrid.css"; // import CSS file
import player1Image from "./image/player1.png";
import player2Image from "./image/player2.png";
import Point from "react-hexgrid/lib/models/Point";

const HexGrid = () => {
  const navigate = useNavigate();

  // state ของตัวละคร 2 ตัวและคะแนน
  const [characters, setCharacters] = useState([
    { id: 1, name: "Player 1", score: 0 , image: player1Image },
    { id: 2, name: "Player 2", score: 0 , player2Image },
  ]);

  const [items, setItems] = useState([
    { id: 1, score: 0 },
    { id: 2, score: 0 },
    // สามารถเพิ่มไอเท็มเข้าไปได้ตามต้องการ
  ]);

  // state ของเวลานับถอยหลัง
  const [timeLeft, setTimeLeft] = useState(30);

  
  useEffect(() => {
    if (timeLeft === 0) {
      alert("Time's up!");
      setTimeLeft(30); // เริ่มนับถอยหลังใหม่เป็น 90 วินาที
    }
  }, [timeLeft]);

  useEffect(() => {
    function handleKeyPress(event) {
      if (event.key === "x") {
        const confirm = window.confirm("Go back to main menu?");
        if (confirm) {
          navigate("/");
        }
      }
    }
    window.addEventListener("keydown", handleKeyPress);

    return () => {
      window.removeEventListener("keydown", handleKeyPress);
    };
  }, [navigate]);

  useEffect(() => {
    const timer =
      timeLeft > 0 && setInterval(() => setTimeLeft(timeLeft - 1), 1000);
    return () => clearInterval(timer);
  }, [timeLeft]);

  const getHexProps = (hexagon) => {
    return {
      style: {
        fill: "#CCCC66",
        stroke: "white",
      },
      onClick: () =>
        alert(`Hexagon n.${hexagon} has been clicked by Player 1`),
    };
  };

  const renderHexagonContent = (hexagon) => {
    return (
      <text
        x="100%"
        y="100%"
        fontSize={100}
        fontWeight="lighter"
        style={{ fill: "white" }}
        textAnchor="middle"
        color="red"
      >
        {hexagon}
      </text>
    );
  };

  //จำนวนrow
  let hexagons = times(902, (id) => id);

  return (
    <div className="grid-container">
      <HexagonGrid
        gridWidth={1100}
        gridHeight={800}
        hexagons={hexagons}
        hexProps={getHexProps}
        renderHexagonContent={renderHexagonContent}
        className="hexagon-grid"
      />
      <div className="characters-container">
      {characters.map((character) => (
  <div key={character.id} className="character">
    <p>
      {character.name} 
    </p>
    <p>
       Score {character.score}
    </p>
    <a href="character.html">{character.name}</a>
  </div>
))}
        
      </div>
      <div className="timer-container">
        <p>Time Left: {timeLeft}s</p>
      </div>
    </div>
  );
};

export default HexGrid;