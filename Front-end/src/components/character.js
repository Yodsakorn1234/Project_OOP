import React, { useEffect } from "react";
import HexagonGrid from "./hexagongrid.";
import times from "lodash/times";
import { useNavigate } from "react-router-dom";

const character1 = document.querySelector('#character1');
const character2 = document.querySelector('#character2');
const name1 = document.querySelector('#name1');
const name2 = document.querySelector('#name2');

character1.addEventListener('click', () => {
  character1.classList.add('selected');
  character2.classList.remove('selected');
});

character2.addEventListener('click', () => {
  character2.classList.add('selected');
  character1.classList.remove('selected');
});

function startGame() {
  const player1 = {
    name: name1.value,
    character: document.querySelector('./image/player1').getAttribute('src')
  }
  
  const player2 = {
    name: name2.value,
    character: document.querySelector('.selected:not(#character1) img').getAttribute('src')
  }
  
  console.log(player1, player2);
  
  // ทำต่อได้ตามต้องการ
}

document.querySelector('button').addEventListener('click', startGame);
