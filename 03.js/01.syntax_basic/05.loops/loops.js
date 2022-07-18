// 기본
// 반복문 사용 키워드 for
// for (let i = 1; i < 5; i++) {
//     console.log(i);
// }

// const rainbow = 'rainbow';
// console.log(rainbow.length); // 문자열 객체 rainbow의 property인 length에 접근(조회)
// for (let i = 0; i < rainbow.length; i++) {
//     console.log(rainbow[i]);
// }

// 중급
const foods = ["apple", "orange-cookie", "avocado", "plum", "kiwi"];
let favorite = "My favorite food is ";

const para = document.querySelector("p");
// console.log(para);

for (let i = 0; i < foods.length; i++) {
  // favorite += foods[i] + ', ';

  // 개선
  if (i === foods.length - 1) {
    favorite += "and " + foods[i] + ".";
  } else {
    favorite += foods[i] + ", ";
  }
}

para.textContent = favorite;

// Array.prototype.forEach(??)
const fruits = ["apple", "banana", "coconut"];
// forEach()를 활용하여 fruits의 요소 출력
fruits.forEach((fruit) => console.log(fruit));

// for in & for of

let cookie = {
  // enumerable
  product_name: "HERSHEY",
  product_vendor: "costco",
  product_id: "c1",
};

let scores = [33, 52, 21, 15, 28]; // iterable

/**
 * enumerable: 직사각형
 * iterable: 정사각형
 *
 * 모든 iterable은 enumerable이지만,
 * 모든 enumerable은 iterable이 아님.
 *
 * iterable은 내부 순서를 가지고 있지만,
 * enumerable은 구별되는 파트를 가지고 있지만,
 * 순서는 없음
 */

// enumerable on for-in
for (const key in cookie) {
  //
  console.log(key + ": " + cookie[key]);
}
////for-of
// for(const key of cookie) { // cookie is not iterable, for-of에서 of 뒤에는 iterable이 와야함
//     console.log(key  + ": " + cookie[key]);
// }

// iterable on for-in
for (const item in scores) {
  console.log(item + ": " + scores[item]);
}
//for-of
for (const item of scores) {
  console.log(item);
}
