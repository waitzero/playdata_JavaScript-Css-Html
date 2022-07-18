// Json:'J'ava'S'cript 'O'bject 'N'orientation
// Notation:표기법

// 클라이언트와 서버 간의 HTTP통신을 위한 텍스트 데이터 포맷
// JS에 종속되지 않는 언어 독립형 데이터 포멧
// 대부분의 프로그래밍 언어에서 사용가능

//Json작성 방식은 JavaScript객체 작성 방식과 유사
//Json작성 방식:key값 및 문자열은 ""(쌍따음표만 가능)로 작성해야함

// {"title":"노인과 바다",
// "author":"해밍웨이",
// "isSold":"false",
// "genere": ["novel","essay"],
// }
//js pbject
const book = {
  title: "노인과 바다",
  author: "해밍웨이",
  isSold: false,
  genre: ["소설", "경험담"],
};

JSON.stringify(book); //Js object를 Json포멧의
console.log(Json.stringify(book));
console.log(book.title);
//  console.log(jsonData);
//  console.log(typeof jsonData);
//  console.log(jsonData[10]);

// Json.stringify()는 객체 뿐만 아니라 배열도 JSON포멧의 문자열러 직렬화함
// 일반적으로 서버로 보내는 데이터는 한개일 수도 있지만, 여러 개일 수도 있기 때문

const books = [
  { id: 1, title: "하농", author: "하농", isSold: false },
  { id: 2, title: "체르니", author: "체르니", isSold: true },
  { id: 3, title: "부르크뮐러", author: "부르크뮐러", isSold: true },
];
const jsonData2 = Json.stringify(books);
console.log(typeof jasonData2, jasonData2);
