const textAreaArray = document.getElementsByClassName("Card__body__content");

// 변수 네이밍 컨벤션, 도메인과 관련된 용어를 정의

// source : 번역할 텍스트와 관련된 명칭
// target : 번역된 결과와 관련된 명칭

// 배열 구조 분해 할당(Array destructuring)
const [sourceTextArea, targetTextArea] = textAreaArray;
const [sourceSelect, targetSelect] =
  document.getElementsByClassName("form-select");

// 번역하고자 하는 언어의 타입(ko? en?, ja?)
let targetLanguage = "en";
// 한국어가 선택되면 targetLanguage의 값이 'ko'로 변경됨

console.dir(targetSelect);
// 어떤 언어로 번역할지 선택하는 target selectbox의 선택지 값이 바뀔 때마다 이벤트가 발생, 각 언어의 타입? ko, en, ja가 출력되도록
targetSelect.addEventListener("change", () => {
  const selectedIndex = targetSelect.selectedIndex;
  targetLanguage = targetSelect.options[selectedIndex].value; // 'ko', 'en', 'ja'
  // console.log(targetLanguage);
});

// sourceTextArea에 입력된 값을 콘솔에 출력
// keydown, keyup, change, ...

sourceTextArea.addEventListener("input", (event) => {
  // console.log(event);
  const text = event.target.value; // sourceTextArea에 입력한 값

  // ajax 기술, new XMLHttpRequest();

  const xhr = new XMLHttpRequest();

  const url = "/detectLangs"; // node 서버의 특정 url 주소

  xhr.onreadystatechange = () => {
    if (xhr.readyState === 4 && xhr.status === 200) {
      // 최종적으로 papago가 번역해준 번역된 텍스트 결과를 받는 부분(추후 작성) - 서버의 응답 결과를 확인하는 부분
    }
  };

  // 요청 준비
  xhr.open("POST", url);

  // 요청을 보낼 때 동봉할 객체(object)
  const requestData = {
    text, // text: text,
    targetLanguage, // targetLanguage: targetLanguage
  };

  // 클라이언트가 서버에게 보내는 요청 데이터의 형식이 json 형식임을 명시
  xhr.setRequestHeader("Content-type", "application/json"); // Header : 제품의 설명서

  // 보내기 전에 해야 할 일, JS Object를 JSON으로 변환
  const jsonData = JSON.stringify(requestData);

  // 실제 요청 전송
  xhr.send(jsonData);
});
