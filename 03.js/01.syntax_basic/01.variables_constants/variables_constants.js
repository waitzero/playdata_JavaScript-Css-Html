console.log("하이");

let userName; //userName이라는 공간 할당 받음=>변수 선언
console.log(userName);
userName = "Yoo"; //변수의 초기회 (Initialization)
console.log(userName);

//재할당
userName = "why";
console.log(userName);

//상수(Constant):재할당 불가능, 처음에만 할당 가능
const allUser = 20;
console.log(allUser);

allUser = 5; //Uncaught TypeError: Assignment to constant variable.=>상수에 재할당 불가능
