package dev.syntax.step04oop.step09interface.basic;

public class SharkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shark s = new Shark();
		
		if(s instanceof Unit) {
			System.out.println("S는 Unit의 하위 클래스 입니다.");
		}
		if(s instanceof Horrible) {
			System.out.println("s는 Horrible 인터페이스를 구현했스빈다.");
		}
		if(s instanceof Moveable) {
			System.out.println("s는 Moveable 인터페이스를 구현했스빈다.");
		}
		if(s instanceof Biteable) {
			System.out.println("s는 Biteable 인터페이스를 구현했스빈다.");
		}
		if(s instanceof Object) {
			System.out.println("s는 Obeject 인터페이스를 구현했스빈다.");
		}
	}

}
