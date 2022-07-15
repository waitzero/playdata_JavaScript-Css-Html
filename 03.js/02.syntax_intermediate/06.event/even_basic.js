const evPropButton = document.getElementById("btn=ev-prop");
console.dir(evPropButton);

evPropButton.onclick = () => console.log("button clicked by event property");
//button clicked by event property

evPropButton.onclick = () => console.log("button clicked everyday");

console.log(evPropButton.onclick); //이벤트핸들러 프로퍼티에 들록된 것

//하나의 이벤트 밖에 등록 불가
evPropButton.onclick = () => console.log("또다른 클릭 이벤트");

//3.addEventListner 방식
//이벤트 핸들러 프로퍼티에 영향을 미치지 않기 때무에
//복수의 이벤트 등록이 가능, 등록된 모든 이벤트가 호출됨
const addEvLsnrButton = document.getElementById("btn-add-ev-lsnr");
console.log(addEvLsnrButton);

function buttonHandler() {
  console.log("double clicked!");
}
addEvLsnrButton.addEventListener("dblclick", buttonHandler);
//화살표 함수로 작성
const buttonHandler2 = () => {
  console.log("mouseover");
};
//버튼에 마우스를 올렸을 때 동작하는 이벤트 작성
addEvLsnrButton.addEventListener("mouseover", mouseover);
