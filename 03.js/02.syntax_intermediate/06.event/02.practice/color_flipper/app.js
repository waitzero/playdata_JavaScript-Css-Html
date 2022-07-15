// 3개의 random 값을 배열로 반환하는 함수 getRandomNumber
function getRandomNumber(min, max) {
  //최댓값도 포함, 최솟값도 포함
  let randomRGBArray = [];
  for (let i = 0; i < 3; i++) {
    let randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
    randomRGBArray.push(randomNumber);
  }
  console.log(randomRGBArray);

  return randomRGBArray;
}

const btn = document.getElementById("btn");
const color = document.querySelector(".color");
console.dir(color);

btn.addEventListener("click", () => {
  // console.log('button clicked!');

  // bad
  // const resultArray = getRandomNumber(0, 255);
  // const red = resultArray[0];
  // const green = resultArray[1];
  // const blue = resultArray[2];

  // good
  const [r, g, b] = getRandomNumber(0, 255);
  // console.log(r, g, b);
  const rgbColor = `rgb(${r}, ${g}, ${b})`;
  document.body.style.backgroundColor = rgbColor;
  color.textContent = rgbColor;
  color.style.color = rgbColor;
});
