package dev.syntax.step04oop.step01class;

public class MouseTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse jerry;
//		System.out.println(jerry);초기화 안되어있기 때문에 컴파일 에러 발생
	
		jerry = new Mouse();//세로운 인스턴스 생성후 주소값 할당
		System.out.println(jerry);
	}

}
