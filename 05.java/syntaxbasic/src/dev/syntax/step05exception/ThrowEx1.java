package dev.syntax.step05exception;

public class ThrowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception();//예외 인스턴스 직접 생성
			throw e;//예외를 발생기킴(다른말로 예외를 던진다
		}catch (Exception e) {
			System.out.println("예외 메세지:"+ e.getMessage());
			e.printStackTrace();//스택 프레임 추적
		}
		System.out.println("프로그램 정상 종료");
		}
	}	

