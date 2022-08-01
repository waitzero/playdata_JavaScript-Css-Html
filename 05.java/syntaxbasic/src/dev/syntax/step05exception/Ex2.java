package dev.syntax.step05exception;

public class Ex2 {

	public static void main(String[] args) {
		//예외처리 구문, 키워드(try-catch)
		//try{여외가 발생할 가능성이 있는 코드를 작성} catch(발생할 수 있는 예외클래스명 참조 변수명){해당 예외에 대한 대처 코드}
		//->try{}:try블럭(block)내부에 예외가 발생할 가능성이있는 코드를 장석
		int number = 100;
		int result =0;
		
		for(int i= 0; i<10; i ++) {
			try {
			result = number/(int)(Math.random()*10);
			System.out.println(result);
		}catch(ArithmeticException exception) {
			System.out.println("0으로 나누는건 어떰?");
		}//try-catch끝
		}//for의 끝

	}//main()끝
}
