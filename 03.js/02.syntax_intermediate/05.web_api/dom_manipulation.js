//DOM객체
console.log(document); //html 문서에 대한 기본 정보만 출력

console.dir(document); //조금 더 자세한 정보 조회
//->document 객체의 프로퍼티 조회가 가능

console.log(window.document);
// //window 객체 내부에 document가 하나의 프로퍼티로 존재

// console.log(window.document === document); //true조작

// //Dom조작
// console.log(document.querySelector("h1"));

document.getElementById("main-title");
const h1 = document.getElementById("main-title");
console.dir(h1.innerText);

//lielement중에서 class이름이 list-item인 노드(객체) 가져오기
console.log(document.getElementsByClassName("list-item"));
//Css Selector을 통한 조회, 선택자 기호 필수
console.log(document.querySelector("#main-title"));
console.log(document.querySelector(".list-item")); //가장 첫번째 노드만 가져오기

console.log(document.querySelectorAll(".list-item")); //NOdeList
