package dev.syntax.step05extends;

public class MouseTest {

	public static void main(String[] args) {
		Mouse jamie = new Mouse(2, "하늘색", "하와이"); // 하와이에 살고 있는 제이미
		System.out.println(jamie.getColor());
		
//		jamie.sing(); // Animal 클래스의 sing() 호출됨(Animal클래스의 특성(age, color, sing())을 물려받음,
		// 동물은 어떻게 울지?(?)
		
		// 쥐는 찍찍 울 수 있잖아?
		jamie.sing(); // 찍찍!
		
//		System.out.println(jamie.getColor());
//		System.out.println(jamie.getAge());
		
		
		Mouse jenny = new Mouse(3, "노란색", "일본");
		jenny.sing(); // 찍찍!
		
		Animal anAnimal = new Animal();
		anAnimal.sing();// 동물은 어떻게 울지?
		
		System.out.println(jamie);
		System.out.println(jamie); // "안녕하세요? 저는 2살이고, 하늘색 피부에 하와이에 삽니다."
		
		
		
	}

}


