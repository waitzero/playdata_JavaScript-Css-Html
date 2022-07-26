package dev.syntax.step05extends;

public class Mouse extends Animal {// 상속(inheritance)의 keyword(예약어) : extends
	
	// extends 키워드를 써서 상속 관계를 형성하면 슈퍼 클래스(Animal)의 필드를 하위 클래스(Mouse)에서도 사용할 수 있다.
	// 눈에 보이지 않지만, 작성되어 있음
	// public int age;
	// public String color;
	
	// 쥐는 거주지(String address)만 있으면 돼
	private String address;
	
	// 매개변수를 전체 다 받는 생성자
	public Mouse(int age, String color, String address) {
		// super(), 상위 클래스의 생성자를 호출하는 메서드, 상위 클래스의 생성자 중에서도 기본 생성자를 호출 메서드
		//String color = "하늘색";
		//String address = "하와이";
		super(age, color); // super class constructor(), 상위 클래스의 생성자 중에서도 두 필드를 매개변수로 받는 생성자 호출 메서드 
		this.address = address;
	}
	
	// jamie가 자신만의 우는 방식을 새롭게 재정의(overriding)
	public void sing() {
		System.out.println("찍찍!");
	}
	
}