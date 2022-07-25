package dev.syntax.step04oop.step01class;

public class Mouse {//쥐 클래스를 작성
	//쥐에 대한 속성과 행위를 기술하는 부분
	
	//Member ?어떤 클래스이 구성원
	//쥐(Mouse)의 속성
	int age;//쥐의 나이
	String name;//쥐의 이름
	String country;//쥐의 국적
	String religion;//쥐가 살고 있는 지역
	String address;//쥐가 살고 있는 주소
	
	//Mouse의 행위(Method)
	void sing() {
		System.out.println(name+"찎찍");
		//name에 mickey가 나오는 이유(MouseTest.java에서)
		//같은 클래스 내에서는 속성, 변수에 자유롭게 접근(사용) 가능
	}
	//생성자(메서드), Constructor, class이름과 동일
	//Mouse()의 파라미터로 아무것도 없는 생성자를 기본 생성자(default constructor)
	public Mouse() {
		System.out.println("Mouse()호출");
	}
	//매개변수가 있는 생성자
	public Mouse(String mouseName, String country, int age, String religion, String address) {
//		System.out.println("매개변수가 있는 생성자 호출");
		name = mouseName;
//		country = country;// 5=5;
		this.country = country; //this(자기자신) =mickey
		this.age=age;
		this.religion = religion;
		this.address = address;
	}
}
