package dev.syntax.step04oop.step04practice.step06.poly.step02param;

public class WalkTest { // Walk ? Work

	public static void main(String[] args) {
		Cat c = new Cat("tom");
		Dog d = new Dog("spike");

		Animal a = new Animal("어떤 동물");
		
		Person p = new Person();
		
//		p.walk(c); // 고양이와 산책
//		p.walk(a);
		
		Object o = new Object();
//		p.walk(o);//The method walk(Animal) in the type Person is not applicable for the arguments (Object)
		
		Cat f = (Cat)new Animal("어떤 동물이라구요"); // 컴파일 에러는 사라졌네?, 대신 런타임 에러가 발생
		// 하위 타입의 참조변수로는 상위 타입의 인스턴스를 참조할 수 없음
		// 하위 타입이 다룰 수 있는 멤버의 개수 >= 상위 타입이 다룰 수 있는 멤버의 개수
	}
}
