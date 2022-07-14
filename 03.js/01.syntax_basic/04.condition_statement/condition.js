// let shoppingDone = false; // 쇼핑 진행 여부
// let childsAllowance; // 내 용돈

// if (shoppingDone === true) { // 엄마의 쇼핑을 도와줬으면, 용돈을 더 받을 수 있다.
//     childsAllowance = 10;
// } else {
//     childsAllowance = 5; // 쇼핑을 도와주지 않아서 조금 밖에 못 받았다.
// }

// console.log(`내 용돈은 ? ${childsAllowance} 딸라!`);

// ===================================
// 1. if-else
// let monster = '리자몽';
// if(monster === '리자몽') {
//     console.log('일단 백만볼트 쓰고, 몸통 박치기 1,000회 실시');
// } else {
//     console.log('백만 볼트!!'); // 웅이 사망.
// }

// 2. else if
// let monster = '거북왕';
// if (monster === '리자몽') {
//     console.log('119 신고');
// } else if (monster === '거북왕') {
//     console.log('도망');
// } else { // else if는 if와 else 사이에만 작성 가능
//     console.log('백만볼트');
// }

// 3. 조건의 중첩(Nesting)
// let monster = '거북왕';
// let physical = '작고 귀여움';

// if (monster === '거북왕') {
//     if(physical === '작고 귀여움') {
//         console.log('싸운다');
//     } else {
//         console.log('run away');
//     }
// }

// == cookie
const select = document.querySelector("select");
// console.log(select);

const paragraph = document.querySelector("p");
// console.log(paragraph);

select.addEventListener("change", setResult);

function setResult() {
  const choice = select.value;

  if (choice === "one") {
    // 값이 1번이면,
    paragraph.textContent = "하늘에서 천사가 내려와 쿠키를 한 박스 주고 갔다.";
  } else if (choice === "two") {
    // 값이 2번일 경우,
    paragraph.textContent = "이 과자쪼가리가 뭐라고.. 엄마한테 혼났따";
  } else {
    // 값이 1번이나 2번이 아닐 경우(random일 경우)
    paragraph.textContent = "가만히 있어";
  }
}
