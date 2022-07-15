//String을 생성하는 법
// 1.원시 타입으로 문자열 생성
const stringPrimitive = "A new String";
//2. 참조타입으로 문자열 생성
const stringObject = new String("A new string");

console.log(`${typeof stringObject}, ${stringPrimitive}`);

const aString = "How are you?";
console.log(aString);
console.log("01234567891011");

console.log(aString[4]);
console.log(aString.charAt[5]);

console.log(aString.indexOf(`o`));
console.log(aString.lastIndexOf(`o`));
