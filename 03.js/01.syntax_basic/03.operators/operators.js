console.log(8 + 8);
console.log(45 - 7);
console.log(78 * 77);
console.log(45 / 9);
console.log(13 % 2); //나머지 값
console.log(2 ** 102);

//증감 연산자
let age = 5;
//후위 연산자:코드의 실행 종료 후 연산이 진행
console.log(age++);
console.log(age--);
console.log(age);

//전위 연산: 연산 후 코드 실행
console.log("전위 연산");
console.log(++age);
console.log(--age);

console.log(age >= 3);
//관계 연산자
let result = age > 4;
console.log(result);
console.log(age <= 3);

//동등 연산자
console.log("동등 연산자");
console.log(1 == "1");
console.log(1 == 1); //비교 전에 값이 숫자면 같은 타입으로 변환 후 연산
console.log(1 === "1"); //false, 엄격한 비교(strict), javascript feature
console.log(1 !== 3);
//논리 연산자
console.log("논리 연산자");
console.log(true && true);
console.log(5 > 3 && 2 === 2); //and 연산
console.log(5 > 3 || 2 !== 2);

//상향 연산자
let yourAge = 5;
let beverage = yourAge >= 20 ? "Soju" : "sprite";
console.log(beverage);

//할당 연산자(우선 순위가 낮음), 변수에 값을 대입할 때 사용하는 연산자
yourAge += 1; //yourAge = youtAge +1 과 동일한 코드
console.log(yourAge);
