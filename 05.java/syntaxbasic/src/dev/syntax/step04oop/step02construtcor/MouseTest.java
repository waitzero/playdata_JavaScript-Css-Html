package dev.syntax.step04oop.step02construtcor;

public class MouseTest {

	public static void main(String[] args) {
		//기본 생성자를 활용한 Mouse 인스턴스 생성
		Mouse m1 = new Mouse();
		
		//age만 파라미터로 갖는 생성자를 활용한 Mouse 인스턴스 생성
		Mouse m2 = new Mouse(2);
	}

}
