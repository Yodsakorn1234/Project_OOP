import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import HexagonGrid from './hexagongrid.';
import HexGridDemo from './Grid';

function MainMenu() {
  const [showGameRule, setShowConstructionPlan] = useState(false);
  const [showHowToPlay, setShowHowToPlay] = useState(false);
  const [showHexMap, setShowHexMap] = useState(false);
  const navigate = useNavigate();

  function handleHowToPlayClick() {
    setShowHowToPlay(true);
  }
  
  function handlePlayClick() {
    setShowHexMap(true);
    navigate('/Grid');
  }

  function handleConstructionPlanClick() {
    setShowConstructionPlan(true);
  }

  return (
    <div>
      <h1>UPBEAT PROJECT</h1>
      <div className="button-container">
        <p>
          <button
            className="play-btn play-xlarge play-round-xxlarge"
            onClick={handlePlayClick}
          >
            Play
          </button>
        </p>
        <button
          className="htp-btn htp-xlarge htp-round-xxlarge"
          onClick={handleHowToPlayClick}
        >
          How to Play
        </button>
        <button
           className="construction-plan-btn game-rules-xlarge game-rules-round-xxlarge"
          onClick={handleConstructionPlanClick}
        >
         ConstructionPlan
       </button>
      </div>
      {showHowToPlay && (
        <div className="modal">
          <div className="modal-content">
            <a href="howtoplay.html">How to play</a>
          </div>
        </div>
      )}
      {showGameRule && (
        <div className="modal">
          <div className="modal-content">
            <a href="ConstructionPlan.html">ConstructionPlan</a>
          </div>
        </div>
      )}
      {showHexMap && <HexGridDemo />}
    </div>
  );
}

export default MainMenu;