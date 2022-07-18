function count(type) {
  // 결과를 표시할 element
  const resultElement = document.getElementById("result");

  // 현재 화면에 표시된 값
  let number = resultElement.innerText;

  // 더하기/빼기/초기화
  if (type === "plus") {
    number = parseInt(number) + 1;
    resultElement.style.color = "green";
  } else if (type === "minus") {
    number = parseInt(number) - 1;
    resultElement.style.color = "red";
  } else if (type === "reset") {
    number = 0;
    resultElement.style.color = "black";
  }

  // 결과 출력
  resultElement.innerText = number;
}
