package dev.syntax.step04oop.step02construtcor;

public class Mouse {
	int age;//쥐의 나이
	String name;//쥐의 이름

//	생성자(constructor)-생성자 메서드
//	new 연산자와 함께 사용되며, 어떤 객체의 인스턴스를 만들 때 사용
//	생성자 작성 규칙
//	 1.별도의 반환 타입이 없음(내부적으로 void가 동작)
//	 2.생성자 메서드의 이름은 클래스의 이름과 동일(대문자까지 동일하게)
//	 3.복수의 생성자를 작성할 수 있다.
//	  3-1.생성자 오버로딩
//	      ->메서드의 이름은 동일하고, 매개변수의 개수 or 타입, 작성 순서가 다를 경우 중복해서 작성 가능
	
	
	
//	//쥐가 우는 동작을 하는 메서드
//	 public void sing() {System.out.println("찍찍~");}//Duplicate method sing() in type Mouse
//	 public void sing() {System.out.println("짹찍~");}//메서드 이름이 중복되서. 동시에 작성 불가능
	 
	 
	//매개변수 가 하나도 없는 생성자를 기본 생성자라고 함
	public Mouse() {}
//	public Mouse() {}//매개변수까지 동일하니까 중복 작성 불가능
	//age만 파라미터로 갖는 생성자
	public Mouse(int age) {
		this.age = age;
	}
	public Mouse(String name) {
		this.name = name;
	}
	public Mouse(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

