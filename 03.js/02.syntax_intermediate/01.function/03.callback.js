//콜백 함수 =기본
function greeting(name) {
  console.log(`Hello ${name}`);
} //$=탬플랏 리터럴 문법

function userInput(name, callbackFN) {
  //const callbackFn = greeting
  callbackFN(name); //greeting('Yoo')와 같음
}
//userInput 함수의 인자값으로 greetring 함수를 전달
userInput("Yoo", greeting); //값으로 전달하는거니까 함수이름이 아닌 값으로 작성=>()필요없음

function waitCoupang(pkg, callbackFN) {
  console.log(`쿠팡에서 ${pkg}가 도착했다.`);
  callbackFN();
}
function bringToNeighbor() {
  console.log(`옆집아주머니에게 전달완료`);
}
waitCoupang("사과", bringToNeighbor);
