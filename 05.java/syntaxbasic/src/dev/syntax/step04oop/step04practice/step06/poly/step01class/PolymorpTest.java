package dev.syntax.step04oop.step04practice.step06.poly.step01class;

public class PolymorpTest {

	public static void main(String[] args) {
		// 상위 (클래스) 타입의 참조변수로 하위 (클래스) 타입의 인스턴스를 참조할 수 있음
		// 상위 타입의 참조변수로 하위 타입의 인스턴스를 참조할 수 있음
		// 참조한다 ? -> 변수에 담겨있는 주소값을 가지고, 실제 인스턴스의 위치로 찾아간다.
		Animal anAnimal = new Whale(); // 고래는 동물이다.(하위 타입이 상위 타입으로 자동 형변환, 단 두 클래스가 서로 상속 관계일 경우에 한해서)
		anAnimal.name = "Animal 타입의 ";
		
		anAnimal.sing(); // 

		// 자신의 타입의 참조변수로 자신의 타입의 인스턴스 참조
		Whale naver = new Whale();
		naver.name = "Whale 타입의 ";
		
		naver.sing(); // 오버라이딩을 하지 않아서 상위 클래스의 메서드가 그대로 호출됨
		
		naver.swim();
		
		anAnimal.swim(); // The method swim() is undefined for the type Animal
		// 상위 타입(Animal)의 참조변수(anAnimal)로는 하위 타입(Whale)의 인스턴스의 멤버(swim()) 사용 불가
		
//		Whale w = new Animal(); // Type mismatch: cannot convert from Animal to Whale
	}

}