package dev.syntax.step05exception;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 예외가 발생하면 catch 블럭 내부로 이동하기 때문에
			System.out.println(4); // 실행되지 않음
		} catch (Exception ae) {
//			System.out.println(ae);
//			ae.printStackTrace();//stackframe에 있는 메서드를 순차적으로 추저ㅏㄱ
//			System.out.println(ae.getMessage());
		}
		System.out.println(6);
	}

}
