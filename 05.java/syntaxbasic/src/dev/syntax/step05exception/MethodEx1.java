package dev.syntax.step05exception;

public class MethodEx1 {

	public static void main(String[] args) throws Exception {
		method1();
	} // 닫는 중괄호 -> 해당 메서드의 종료
	
	static void method1() throws Exception {
		method2();
	} // method1의 끝

	static void method2() throws Exception { // throws Exception: method2()를 호출한 곳(method1())으로 예외에 대한 처리(책임)를 떠넘김
		/*
		 * Exception e = new Exception();
		 * throw e;
		 */
		throw new Exception(); // 위와 동일한 코드, 한 줄로 작성
		// -> Unhandled exception type Exception
	} // method2의 끝
}
