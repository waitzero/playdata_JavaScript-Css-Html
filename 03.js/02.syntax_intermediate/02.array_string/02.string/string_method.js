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
//String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
console.log(aString.charAt(5));
//메서드는 배열에서 지정된 요소를 찾을 수 있는 첫 번째 인덱스를 반환하고 존재하지 않으면 -1을 반환합니다.
console.log(aString.indexOf(`o`));
//lastIndexOf() 메서드는 주어진 값과 일치하는 부분을 fromIndex로부터 역순으로 탐색하여, 최초로 마주치는 인덱스를 반환합니다.
//일치하는 부분을 찾을 수 없으면 -1을 반환합니다.
console.log(aString.lastIndexOf(`o`));

console.log(aString.slice(8, 11));
console.log(aString.length);

// Splitting strings
const originalString = "How are you?";

// Split string by whitespace character
const splitString = originalString.split(" ");

console.log(splitString, Array.isArray(splitString));
console.log(splitString[1]);

// Trimming Whitespace
const tooMuchWhitespace = "     How are you?     ";

const trimmed = tooMuchWhitespace.trim();

console.log(trimmed);

// Finding and Replacing String values

// Replace the first instance of "How" with "Where"
const newString = originalString.replace("How", "Where");

console.log(newString);
