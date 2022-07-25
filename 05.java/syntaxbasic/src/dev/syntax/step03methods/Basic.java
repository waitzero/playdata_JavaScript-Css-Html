package dev.syntax.step03methods;

public class Basic {

	public static void main(String[] args) { // 여는 중괄호 : 메서드의 시작
		// 1. Java에서는 함수 대신 메서드(Method)라는 용어를 사용한다.
		
		/*
		 * 날씨가 너무 더워서 갈증이 난 제리는
		 * 자판기를 찾고 기쁜 나머지 자판기로 뛰어갔다.
		 */
		
		String myDrink = drinkMachine(3); // 메서드 실제 호출
		System.out.println(myDrink); // 선택한 음료
		
//		System.out.println(drinkMachine(2));
		
	} // 닫는 중괄호 : 메서드의 끝
	
	// 접근제어자 반환타입 메서드명(파라미터 나열) { 구현부 코드 작성 부분 }
	public static String drinkMachine(int number) { // 메서드 선언(정의)부
		
		System.out.println("음료수 가동!");
		// 메서드 구현부
		String drink = null; // 값이 할당되지 않았다는 의미를 뜻하는 null keyword
		
		if (number == 1) {
			drink = "제로 콜라";
		} else if (number == 2) {
			drink = "스프라이트";
		} else if (number == 3) {
			drink = "닥터 페퍼";
		} else {
			drink = "지금 뭐하시는 건가요?";
		}
		
		return drink;
		
//		return ""; // empty string으로 컴파일 에러 일시적으로 해결, This method must return a result of type String 
	}
}

