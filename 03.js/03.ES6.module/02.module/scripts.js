//import {불러올 함수명}from '해당함수를 가지고있는 파일의 경로
import { sum, sub, mul, div } from "./fuction";
import { number as num, obj, array } from "./fuction";

const x = 10;
const y = 5;

document.getElementById("x").textContent = x;
document.getElementById("y").textContent = y;

document.getElementById("sum").textContent = sum(x, y);
document.getElementById("sub").textContent = sub(x, y);
document.getElementById("mul").textContent = mul(x, y);
document.getElementById("div").textContent = div(x, y);
