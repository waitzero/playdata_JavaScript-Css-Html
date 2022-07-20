// Node.js, Express 패키지를 활용하여 간단한 Backend 서버 구성

const express = require("express"); // express 패키지를 import

const app = express();

const clientId = "42X2GTj2SplM6W_Xxw5v";
const clientSecret = "oXIK9Blzsh";

// nodejs 서버가 또 다른 Client가 되어 Naver Papago Server에 요청(request)을 보내기 위해 사용 - request 패키지 설치 필요
const request = require("request");

// express의 static 미들웨어 활용
app.use(express.static("public")); // express한테 static 파일들의 경로가 어디에 있는지 명시

// express의 json 미들웨어 활용
app.use(express.json());

// console.log(`현재 파일명: ${__filename}`);
// console.log(`현재 파일이 위치한 경로: ${__dirname}`);

// 일반적으로 /를 root 경로라고 함
// root url: 127.0.0.1:3000/
// IP주소 : 127.0.0.1, Port : 3000
// 127.0.0.1의 Domain name : localhost -> http://localhost:3000
// root url경로로 요청이 들어왔을 때 호출될 콜백함수.
// 콜백함수는 2개의 인수(arguments)를 받음, 1. request(줄여서 req), response(res)
app.get("/", (req, res) => {
  // res.send('응답 완료!'); // 동작 확인
  // root url, 즉 메인 페이지로 접속했을 때 우리가 만든 Node 서버는 papago의 메인 화면인 index.html을 응답해야함
  res.sendFile(__dirname, "index.html");
});

// localhost:3000/detectLangs 경로로 요청했을 때
app.post("/detectLangs", (req, res) => {
  console.log(query);
  console.log(targetLanguage);
});

// 서버가 실행되었을 때 몇 번 포트에서 실행시킬 것인지
app.listen(3000, () =>
  console.log("http://127.0.0.1:3000/ app listening on port 3000")
);
