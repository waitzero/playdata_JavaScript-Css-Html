// // 콜백 함수 - 기본
// function greeting(name) {
//   console.log(`Hello ${name}`);
// }

// function userInput(name, callbackFn) {
//   //눈에 보이지 않는 코드
//   // const name = 'Yoo';
//   // const callbackFn = greeting

//   callbackFn(name); // greeting('Yoo');와 같음.
// }

// // userInput함수의 인자값으로 greeting 함수를 전달
// userInput("Yoo", greeting);

// function waitCoupang(pkg, callback) {
//   console.log(`쿠팡에서 ${pkg}가 도착했다.`);
//   callback();
// }

// function bringItToNeighbor() {
//   console.log("옆집 아주머니에게 전달 완료!");
// }

// waitCoupang("사과", bringItToNeighbor);

const button = document.querySelector("button");

// button.addEventListener("click", function () {
//   console.log("button clicked!");
// });

const buttonFn = function () {
  console.log("button clicked!");
};

// button.addEventListener("click", buttonFn);
