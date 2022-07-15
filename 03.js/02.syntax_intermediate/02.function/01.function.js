//기본적인 함수 정의,
//함수 작성 방식 첫 번째, 함수 선언문 방식

//함수키워드 함수명(parameter 파라미터)
function add(a, b) {
  //두 수의 덧셈 함수
  const result = a + b;
  //   return a + b;
  console.log(result);
}

//함수호출(call)
// const addResult = add(2,3);
// console.log(addResult);

add(2, 3);

// 두 수의 곱셈 결과를 변환하는 함수, mu;tiply
function multiply(a, b) {
  //함수 선언부
  //그 외 다른 코드들, 함수 구현부(몸체)
  return a * b;
}

console.log(multiply(2, 3));

//Javascripts feature
//함수 역시 하나의 값으로 취급될 수 있습니다
//함수 작성 방식 두번째, 함수 표현식
//함수를 하나의 값으로써 변수에 할당 가능
const div = function division(a, b) {
  return a / b;
};

console.log(div(4, 2));
console.log(div); //함수 자체가 출력

//ECMA Script => JavaScript와 JScript 등 여러 기술을 하나로 통합한 js표준 문법
//->ES6(ECMA 2015년)

//ES6 문법, 화살표 함수 (Arrow Function)
//함수 작성 방사구 세 번째, 화살표 함수
//function 키워드 대신 화살표(arrow)를 사용하여 좀 도 간략하게 표현 (aka.익명함수)
// 기본형태 ()=>{}
const sub = (a, b) => a - b;
//코드가 한줄이면 return생략 가능

console.log(sub(5, 3));

//인자값이 없는 함수
const greeting = () => console.log("안녕하세요");
greeting();

//즉시 실행 함수 - 함수 정의와 동시에 실행되는 함수, 한 번만 실행되고 다시 호출 불가.
const res = (function () {
  const a = 5;
  const b = 10;
  return a * b;
})();

console.log(res);
