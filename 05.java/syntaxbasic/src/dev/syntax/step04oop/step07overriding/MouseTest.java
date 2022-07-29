package dev.syntax.step04oop.step07overriding;

public class MouseTest {

	public static void main(String[] args) {
		Animal anAnimal = new Animal();
		anAnimal.name = "어떤 동물";
		anAnimal.showName();
		
		Mouse jerry = new Mouse();
		jerry.name = "제리";
		jerry.address = "하와이";
		
//		jerry.showName(); // 내 이름은 비밀이야(오버라이딩)
//		jerry.showName("톰"); // 톰 안녕? 나는 제리야(오버로딩)
		
		Animal mickey = new Mouse();
		mickey.showName();
		
		// 오버라이딩과 다형성
		
		// 길이가 4인 배열
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 2;
		// numbers[2] = "문자열"; // Type mismatch: cannot convert from String to int
		
		// Animal 타입의 배열 animal 선언, 배열의 길이는 4
		// 자바에서의 배열은 동일한 타입의 값만 할당할 수 있음
		Animal[] animals = new Animal[4];
		Cat tom = new Cat();
		animals[0] = tom; // animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Mouse();
		animals[3] = new Cat();
//		tom.sing();
//		new Dog().sing();
//		new Mouse().sing();
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
			animals[i].sing();
			
// Cannot properties of null~~
		}
	}

}



class Whale extends Animal {

	@Override
	void sing() {
		System.out.println("강아지는 멍멍");
	}
	
}