package dev.syntax.step04oop.step09interface.basic;

public class Shark extends Unit implements Horrible{

	@Override
	public void move(int x, int y) {
	System.out.printf("위치를 (%d, %d)만큼 이동합니다", x, y);
	}

	@Override
	public void bit(Unit target) {
		System.out.println(target + "을 깨뭅니다.");
		
	}
	//인터페이스도 상속이 가능
	
	//class Shark는 인터페이스 Movable을 구현한 구현 클래스라고함
	//The type Shark must implement the inherited abstract method Moveable.move(int, int)
	//상어는 움직일 수 있음, 사람을 물어버릴 수도 있음
	//상어한테 움직일 수 있는 능력을 부여해주기 위해서는 Moveable이라는 인터페이스를 구현(implement)해야함
	
}
