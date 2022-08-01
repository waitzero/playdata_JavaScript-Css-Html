package dev.syntax.step05exception;

public class Ex1 {

	public static void main(String[] args) {
		int number = 100;
		int result =0;
		
		for(int i= 0; i<10; i ++) {
			result = number/(int)(Math.random()*10);
			System.out.println(result);
		}
		//ArithmeticException에 대한 예외처리를 해두지 않았기 떄문에 프로그램이 비정상적으로 종료됨
	}

}
