package dev.syntax.step02datatypes;

public class Basic4CharType {

	public static void main(String[] args) {
		// 4. 문자 타입 char (acter)
		
		// 4-1. 문자 타입, 문자를 담을 때 사용, 한 글자의 문자만 저장할 수 있음
		char a = 'A';
//		char b = 'AB'; // Too many characters in character literal(IntelliJ)
		
		// 4-2. 문자 리터럴과 문자열 리터럴(literal)
		/*
		 * 문자와 문자'열'은 서로 다르다.(문자 리터럴과 문자열 리터럴 링크 참조)
           char : Character, 문자의 줄임표현, 홑 따옴표('')사용, 하나의 문자만 감쌀 때 사용하는 Java 키워드
           String : String, 끈을 의미, 하나의 문자가 연속적으로 나열되어있다는 의미, 쌍 따옴표("") 사용,
              두 개 이상의 문자를 사용할 때 쓰는 Java 키워드
		 */
		
//		char grade = "A"; // Type mismatch: cannot convert from String to char
		// 문자열 타입(String)에서만 쌍따옴표 가능
		
		String chocolate = "ABC";
		
		// 4-3. 공백 값(Blank value), 빈 문자열(Empty String)
		String emptyString = ""; // 문자열 리터럴 ""는 아무런 값도 없이 비어있는 문자열을 작성할 수 있음
//		char emptyChar = ''; // Compile error : Empty character literal(IntelliJ), 문자 리터럴은 불가능
		char blankValue = ' '; // 공백(blank)도 하나의 값(value)으로 취급됨
		
		// 4-4. 문자열 결합(String concatnation)
		// + 연산자를 활용하면 값과 값을 연산할 수 있음.
		
		// 4-4-1. 문자열에서의 연산 처리
		String orange = "orange";
		String cookie = "cookie";
		
		String orangeCookie = orange + cookie; // 문자열 + 문자열의 연산결과는 문자열
		System.out.println(orangeCookie);
		
		String sixSigma = 6 + "sigma"; // 숫자 리터럴 + 문자열의 연산결과는 문자열
		System.out.println(sixSigma);
		
		String surprise = true + "혹은 거짓"; // 논리 리터럴 + 문자열 = 문자열
		System.out.println(surprise);
		
		System.out.println(5 + "5"); // ?? 55...
	}
}
