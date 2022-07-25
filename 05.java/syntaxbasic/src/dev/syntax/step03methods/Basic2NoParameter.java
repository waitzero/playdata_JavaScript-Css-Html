package dev.syntax.step03methods;

import java.util.Random;

public class Basic2NoParameter {

	public static void main(String[] args) {
		/*
		 * 2. 파라미터가 없는 메서드
		 * 
		 * 자판기에 갔더니, 원하는 음료를 선택할 수 있는 버튼이 없고, 음료 뽑기 버튼만 있었다.
		 * 랜덤 자판기같다.
		 * 
		 * 음료수 이름(문자열)을 반환하는 메서드 drinkMachine() { 
		 * 	랜덤(0,1,2)으로 음료를 반환하도록 작성 
		 * 	
		 *  음료 목록을 담고 있는 배열 availableDrinkArray 생성
		 *   
		 * } 
		 */
		
		System.out.println(drinkMachine()); // 닥터페퍼! 
		
	}
	
	public static String drinkMachine() { // 별도의 매개변수가 없음
		Random random = new Random(); // Ctrl + Shift + O(import)
		int randomNumber = random.nextInt(2); // 0 ~ 2 사이의 무작위값 추출
		String[] availableDrinkArray = {"스프라이트", "닥터페퍼", "물"};
		// Java에서 배열(array)은 동일한 타입의 값만 담을 수 있음 [] : 배열타입 표기법
		// String[] -> 문자열 값만 담을 수 있는 문자열 배열
		// int[] -> 정수값만 담을 수 있는 정수형 배열
		
		return availableDrinkArray[randomNumber];
	}
}