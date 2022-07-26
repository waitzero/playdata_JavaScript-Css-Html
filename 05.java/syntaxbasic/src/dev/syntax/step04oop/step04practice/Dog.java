package dev.syntax.step04oop.step04practice;

public class Dog {
	//�ɹ� �ʵ�
	private int age;
	private String name;
	private String color;
	//�ɹ� �޼��� ¢������
	public void bark() {
		System.out.println(name+"(��)�� �п� ¢���ϴ�.");
	}
	//������ �޼���
	//1.�⺻ ������
	public Dog() {
		System.out.println("Dog()�⺻������");
	}
	//2.name�� color�� �Ű������� �޴� ������
	public Dog(String name, String color) {
		this.name= name;
		this.color=color;
	}
	//3.age�� color�� �Ű������� �޴� ������
	public Dog(int age, String color) {
		this.age= age;
		this.color=color;
	}
	//age�� �ʵ� ���� ���� ���� �� ���� �������ִ� setter(), getter()�ۼ�
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//name�� �ʵ� ���� ���� ���� �� ���� �������ִ� setter(), getter()�ۼ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//color�� �ʵ� ���� ���� ���� �� ���� �������ִ� setter(), getter()�ۼ�
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
