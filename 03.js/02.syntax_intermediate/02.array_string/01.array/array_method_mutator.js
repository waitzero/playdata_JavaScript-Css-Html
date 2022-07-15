/**
 * 배열 메서드(함수)의 반환 패턴
 *
 * 1. 원본의 직접적인 수정(mutator method)
 */

let fish = ["piranha", "koi", "nimo(?)", "clown-fish"];

console.group("object의 실체(?) 확인");
console.log(typeof fish); // object(객체) ?
console.log(Array.isArray(fish)); // 해당 객체가 array 객체인지 확인, true/false
console.groupEnd();

// 1. 원본을 직접 수정하는 mutator methods

// 1. pop() : 원본 배열의 가장 끝에 위치한 요소를 제거, 해당 값을 반환(return)함, 추가 파라미터는 없음
console.group("pop()");
console.log(`제거된 값 : ${fish.pop()}`);
console.log(fish); // 원본이 수정됨
console.groupEnd();

// 2. shift() : 원본 배열의 가장 첫 번째(앞) 요소 제거.
console.group("shift()");
console.log(`제거된 값 : ${fish.shift()}`); //
console.log(fish);
console.groupEnd();

// 3. push() : 원본 배열의 가장 끝에 새로운 요소 추가. 추가할 요소 작성
console.group("push()");
console.log(`추가된 후 배열의 길이(length) : ${fish.push("shark")}`); // 상어 추가
console.log(fish);
console.groupEnd();

// 4. unshift() : 원본 배열의 가장 앞에서 요소 추가
console.group("unshift()");
console.log(`추가된 후 배열의 길이(length) ${fish.unshift("whale")}`); // 고래 추가
console.log(fish);
console.groupEnd();

// -> shift(), unshift()는 모든 인덱스에 영향을 미침.

// 5. splice() : 정해진 위치에 요소를 추가하거나 제거.
console.group("splice()");

// splice를 활용한 요소 추가.
console.log(fish.splice(1, 0, "tuna")); // 2번째 파라미터를 0으로 지정하면 요소를 삭제하지 않음.
console.log(fish);

// splice를 활용한 요소 제거
console.log(fish.splice(1, 2)); // 1번째 인덱스부터 2개 제거
console.log(fish);

// 추가와 제거를 동시에 하는 법
let dessert = ["다쿠아즈", "식혜", "케이크", "포스틱", "오레오"];
// 1번째 인덱스부터 2개의 요소를 삭제 후, 1번째 인덱스에 '에이스' 추가
console.log(dessert.splice(1, 2, "에이스"));
console.log(dessert);
console.groupEnd();

// 6. reverse() : 배열의 순서를 역순으로 정렬
console.group("reverse()");
console.log(fish.reverse()); // 역순된 배열
console.log(fish); // 원본 변경.
console.groupEnd();

// 7. fill() : 모든 요소들을 주어진 값으로 전부 덮어씀
console.group("fill()");
console.log(dessert);
console.log(dessert.fill("꼬북칩"));
console.log(dessert);

// 시작과 끝 지점 지정 가능.
console.log(dessert.fill("짱구", 1)); // 1번째 인덱스부터 끝까지
console.log(dessert.fill("흰둥이", 1, 3)); // 1번째 인덱스부터 3번째 인덱스 -1까지
console.groupEnd();

// 8. sort() : 오름차순 정렬
console.group("sort()");
fish = ["shark", "whale", "koi", "nimo(?)", "defense"];
console.log(fish.sort()); // abcd 오름차순 정렬
console.log(fish);

// 문자 중에 대문자가 끼어있을 경우
fish = ["Shark", "whale", "koi", "nimo(?)", "defense"];
console.log(fish.sort()); // 대문자가 소문자보다 정렬 기준이 앞섬.

// 문자에 숫자가 추가되어 있다면?
fish = ["Shark", "2 whale", "53 koi", "nimo(?)", "defense"];
console.log(fish.sort());

// 숫자 정렬
let numbers = [53, 42, 33, 63, 2, 87];
console.log(numbers.sort());
