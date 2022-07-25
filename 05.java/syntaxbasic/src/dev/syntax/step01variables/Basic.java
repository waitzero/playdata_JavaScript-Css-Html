package dev.syntax.step01variables;

public class Basic {//클래스 이름은 항상 대문자(Uppercase)
					
	public static void main(String[] args) {
		//1. 변수의 생성, 선언과 초기화로 구성됨
		
		//1-1.변수의 선언
		int a;//Integer의 줄임 표현, "정수 형  변수 a 선언"
//		System.out.println(a);//The local variable a may not have been initialized(변수의 초기화가 안되있음)
		
		//1-2.변수의 초기화
		a=5;//정수 값 5를 할당
		
		//2.변수명 이름 짓기(Variable Naming Convention)
		//문법적으로 허용은 되지만, 일반적인 규칙 or 관례상 사용하지 않는 케이스도 있음
		
		//2-1.영문자(대소문자), 변수는 사실상 소문자로 시작(camelCase)
		int alphabet =26; //The value of the local variable alphabet is not used
//		System.out.println(alphabet); 사용하면 warning사라짐
		
		int Upper =5;
		
		//2-2.특수문자($, _(underbar)기호만 해당, !#@ 등은 불가능), 레거시 코드 및 시스템 내부 코드에서 주로 사용
		int $isLogin = 0;//문법적으로 가능은 하다.
		int _isLogin = 0;
		
		//2-3. 숫자로 시작할 수 없음
//		int 5 = 5; //?
		
		//2-4. Keyword(예약어) 사용 불가(while, int for, break, class 등)
//		int int = 5;
	}

}
