package dev.syntax.step05exception;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("emthod1()에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
		System.out.println("method1 실행 종료");
	}

}
