// String을 사용하는 방식
// 1.''(single quote), 홀 따옴표
// 2.""(double quote), 쌍 따옴표
// 3.``(backtive), 템플릿 리터럴

const novel = "The liitle prince";
const author = "Saint-Exupery";

//템플릿 리터럴(Template literal)
console.log(`My favorite novel is ${novel}by ${author}`);
//변수를 동작 바인딩(binding), 줄바꿈 가능

//템플릿 리터럴 이전의 줄바꿈 방식
const address = `Homer .J. simpson\n` + `742 Evergreen Terrance`\n+`Springfield`; // \n(new Line)
console.log(address);

function createOAuthString(host, clientId, scope) {
    return host + '/login/oauth/authorize?client_id=' + clientId + '&scope=' + scope
  }
  
createOAuthString('https://github.com', 'abc123', 'repo,user');

// ==다른 파일의 어떤 코드 라인
createOAuthString('https://github.com/waitzero', 'waitzero', 'repo,admin');

log