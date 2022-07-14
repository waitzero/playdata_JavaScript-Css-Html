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
