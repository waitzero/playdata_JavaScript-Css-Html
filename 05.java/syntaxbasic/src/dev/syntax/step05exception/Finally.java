package dev.syntax.step05exception;

public class Finally {

	public static void main(String[] args) {
		method1();

	}
	public static void method1() {
		try {
			System.out.println("method1()이 호출 되었음");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1()의 finally block이 실행 되었음");
		}
	}
}
