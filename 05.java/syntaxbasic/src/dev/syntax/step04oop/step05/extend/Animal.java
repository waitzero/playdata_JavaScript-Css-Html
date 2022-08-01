package dev.syntax.step04oop.step05.extend;

public class Animal {
	// �� ���󿡼� �����̶� ���̿� ���� ������ �־�, �� �׷��� ������
	private int age;
	private String color;

	// �⺻ ������
	public Animal() {
		super();
		System.out.println("Animal() �⺻ ������ ȣ��");
	}

	// �Ű������� ���� �޴� ������
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
		System.out.println("������ ��� ����?");
	}
}
