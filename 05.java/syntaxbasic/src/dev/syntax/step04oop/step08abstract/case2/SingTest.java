package dev.syntax.step04oop.step08abstract.case2;

public class SingTest {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();		
		animals[1] = new Mouse();		
		animals[2] = new Dog();		
//		animals[3] = new Animal(); // Cannot instantiate the type Animal
		// Animal 클래스는 추상클래스(abstract)로 지정되었기 때문에 인스턴스(객체) 생성 불가.
		// 누군가가 실수로 Animal 객체를 생성하는 불상사를 막을 수 있음
		
		for (Animal anAnimal : animals) {
			anAnimal.sing();
		}
		
	}

}

class Mouse extends Animal { void sing() { System.out.println("찍찍"); }} // The type Mouse must implement the inherited abstract method Animal.sing()
/*  class Mouse extends Animal { }
 *  상속을 받기로 한 상위 클래스(Animal)가 추상 클래스일 경우, 하위 클래스(Mouse)는 해당 추상 클래스가 가지고 있는 추상 메서드를 무조건 구현하여야 함
 */

class Cat extends Animal { void sing() { System.out.println("야옹"); }}
class Dog extends Animal { void sing() { System.out.println("멍멍"); }}
