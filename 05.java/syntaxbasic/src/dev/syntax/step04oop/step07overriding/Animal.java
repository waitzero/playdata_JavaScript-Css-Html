package dev.syntax.step04oop.step07overriding;

public class Animal {
	String name;
	
	void showName() {
		System.out.printf("나는 %s이야. \n", name);
	}
	
	void sing() {
		System.out.println("dd");
	}
}
class Cat extends Animal{
	@Override
	void sing() {
		System.out.println("고양이는 야옹야옹");
	}
}
class Dog extends Animal{
	@Override
	void sing() {
		System.out.println("강아지는 멍멍");
	}
}