package dev.syntax.step04oop.step07overriding;

public class Mouse extends Animal{
	String address;

	// 쥐는 I라서 이름 알려주기 부끄러워함
	// 오버라이딩 - 재정의 : 상위 클래스의 메서드와 같은 메서드명, 반환타입, 같은 매개변수 리스트
	@Override
	void showName() {
		System.out.println("내 이름은 비밀이야");
	}
	
	// 쥐는 I긴 하지만, 상대방이 먼저 자신의 이름을 전달해주면 자신의 이름을 소개함
	// 오버 로딩 - 중복 정의 : 같은 메서드명, 다른 매개변수(parameter) 리스트
	void showName(String yourName) {
		System.out.printf("%s 안녕? 나는 %s야. \n", yourName, name);
	}
	
	void showAddress() {
		System.out.println("나는" + address + "에 살아");
	}

@Override
void sing() {
	System.out.println("쥐는 찍찎");
}
}