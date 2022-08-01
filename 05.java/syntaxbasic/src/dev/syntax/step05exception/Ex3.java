package dev.syntax.step05exception;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		}catch(Exception e) {//3을 0으로 나누는 과정에서 발생하는 예외 클레스(ArithmeticException)의 인스턴스 (newArithmetic();)가 참조변수 e에 할당됨
		if (e instanceof ArithmeticException) {
			System.out.println(e+"는 ArithmeticException 인스턴스입니다.");
		}
			System.out.println(4);
		}
		System.out.println(5);
	}

}
