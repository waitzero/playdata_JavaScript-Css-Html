package dev.syntax.step04oop.step04practice.step06.poly.step02param;

public class Person {
	
	// 고양이와 산책, + 강아지와의 산책도..?
	void walk(Object anAnimal) {
		// 내부적으로 Animal anAnimal = new Cat();
		
		// 호출 시점(WalkTest.java의 11번라인 p.walk(c))에서 anAnimal이 참조하고 있는 인스턴스가
		// new Cat()인지, new Dog()인지, new Animal()인지 알 수 없음
		
		// 참조변수 anAnimal에 실제로 할당된 참조값이 Cat 인스턴스(new Cat())인지 ?
		// anAnimal은 Cat의 인스턴스다. 맞으면 true, 아니면 false
		
		// 타입 instanceof 타입
		if (anAnimal instanceof Cat) { // 맞으면 true
			Cat c = (Cat)anAnimal; // Cat c = new Cat();
			c.play();
		} 
		
		// Dog 타입인지 확인, 맞으면 Dog 타입의 변수로 담아놓고 산책 ㄱㄱ
		if (anAnimal instanceof Dog) {
			Dog d = (Dog)anAnimal;
			d.play();
		}
		
		if (anAnimal instanceof Animal) { // Animal a = new Animal();
			System.out.println("참조변수의 주소값 : " + anAnimal.getClass().getName() + " 는 Animal 타입으로 형 변환 가능");
			System.out.println("참조변수의 주소값 : " + anAnimal.getClass().getName() + " 는 Object 타입으로 형 변환 가능");
		}
		
		if (anAnimal instanceof Object) {
			System.out.println("참조변수의 주소값 : " + anAnimal.getClass().getName() + " 는 Object 타입으로 형 변환 가능");
		}
		
	}
	
	// 강아지와 산책하고 싶으면?
//	void wlakDog(Dog d) {}
}

