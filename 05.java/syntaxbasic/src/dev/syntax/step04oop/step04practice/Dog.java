package dev.syntax.step04oop.step04practice;

public class Dog {
	//맴버 필드
	private int age;
	private String name;
	private String color;
	//맴버 메서드 짖는행위
	public void bark() {
		System.out.println(name+"(이)가 왈왈 짖습니다.");
	}
	//생성자 메서드
	//1.기본 생성자
	public Dog() {
		System.out.println("Dog()기본생성자");
	}
	//2.name과 color을 매개변수로 받는 생성자
	public Dog(String name, String color) {
		this.name= name;
		this.color=color;
	}
	//3.age와 color를 매개변수로 받는 생성자
	public Dog(int age, String color) {
		this.age= age;
		this.color=color;
	}
	//age의 필드 값을 각각 세팅 및 값을 가져다주는 setter(), getter()작성
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//name의 필드 값을 각각 세팅 및 값을 가져다주는 setter(), getter()작성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//color의 필드 값을 각각 세팅 및 값을 가져다주는 setter(), getter()작성
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
