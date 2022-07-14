//배열 작성 방식 [element, element];
//element : 배열에 들어갈 요소들(HTML의 element가 아님)
const arr = ["orange", "cookie", "orange-cookie"]; //[]배열을 arr이라는 변수에 할당(저장)

console.log(arr);
console.log(arr[0]);
console.log(arr[1]);
console.log(arr[2]);
console.log(arr[3]);

console.log(arr.length); //arr가 가지고 있는 프로퍼티를 조회
//console.log(ironman,motive);//아이언맨의 정보 중 모티브 조화->일론 머스크

//요소의 조회(참조)
console.log(`${arr[0]}`);

// 요소의 추가
// 변수명 [추가할 인덱스 번호, 위치 =할당할 값(리터링)]
arr[3] = "new cookie";
console.log(arr);

//요소의 갱신
arr[3] = 5;
console.log(arr);

//요소의 삭제
const fruits = ["apple", "orange", "kiwi"];
delete fruits[1]; //희소배열이 만들어져서 비추
console.log(fruits); //empty같이 요소의 실제 값은 없지만, 공뭐지시
console.log(fruits[1]); //undefined
console.log(fruits.length);

const nuts = ["walnut", "amond", "pinenut"];
nuts.splice(1, 1);

console.log(nuts);
console.log(nuts.length);
