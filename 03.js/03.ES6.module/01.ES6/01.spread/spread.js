// //...(spread sysntax)
// // 하나로 뭉처있는 여러 값들의 집합을 펼쳐서(전개, 분산, spreading)
// //개별적인 값들의 목록으로 바꿔줌
// //spread 문법 적용 가능한 대상은 Array, String, Map, Set, DOM Collectoin 등으로 한정

// //01.Spread with Arrays
// const fruits = ["apple", "banana"];
// const otherFruits = ["kiwi", "podo"];

// const allFruits = fruits + "," + otherFruits;
// console.table(allFruits);

// const myFruits = [...fruits, ...otherFruits];
// console.table(myFruits);

// const users = [
//   { id: 1, userName: "dj coo" },
//   { id: 2, userName: "dj kie" },
// ];
// console.log(user[0]);

// const newUser = { id: 3, userName: "Run" };
// users.push(newUser);
// console.table(users);

// const secondUser = { id: 4, userName: "ZZang" };
// const updateUser = [...users, secondUser];
// console.log(updateUsers);
// console.log(user.length);
// //3.spread연산을 해도 원본 배열은 변하지 않음

// //배열의 복사
// const originalArray = ["one", "two", "three"];

// const secondArray = originalArray;
// console.log(secondArray);

// secondArray.pop();
// console.log(originalArray);

// const originalArrayWithSpread = ["four", "five", "six"];
// const secondArrayWithSpread = [...originalArrayWithSpread];

// secondArrayWithSpread.pop();
// console.log(originalArrayWithSpread); //원본이 변경되지 않음

// //2.문자열에도 가능

// const aString = "hello";
// const strArray = [...aString];
// console.log(strArray);

// //3.Spread with Objects
// //기존 방식을 사용한 object의 shalldow copy
// const originalObject = {enbled:true, darkMode:false};
// const secondObject = ??//복사 해주 ㅓ~Object.assign();

//spread를 활용한 object shallow copy
const originalObject = { enabled: true, darkMode: false };
const secondObject = { ...originalObject };
secondObject.enabled = false;
console.log(originalObject.enabled);
