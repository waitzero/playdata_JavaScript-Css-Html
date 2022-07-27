package dev.syntax.step05extends;

public class Animal {
	// 내 세상에서 동물이란 나이와 색을 가지고 있어, 난 그렇게 정의함
	private int age;
	private String color;

	// 기본 생성자
	public Animal() {
		super();
		System.out.println("Animal() 기본 생성자 호출");
	}

	// 매개변수를 전부 받는 생성자
	public Animal(int age, String color) {
//		super();
		this.age = age;
		this.color = color;
	}

	// setter, getter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void sing() {
		System.out.println("동물은 어떻게 울지?");
	}
}
