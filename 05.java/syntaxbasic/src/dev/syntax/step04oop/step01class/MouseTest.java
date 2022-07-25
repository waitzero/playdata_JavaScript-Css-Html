package dev.syntax.step04oop.step01class;

public class MouseTest {

	public static void main(String[] args) {
		//클래스를 통해 여러 객체들을 실제로 생성해서 상호작용하는 부분
		//객체들을 생성할 수 있는 가상 세계
		
		//Type variable = new 클래스명();
		Mouse mickey = new Mouse();//mickey라는 이름의 인스턴스 1개 생성
		System.out.println(mickey.name);//정수의기본값은 null
		mickey. name = "미키마우스";
		System.out.println(mickey.name);
		System.out.println(mickey.age);//int의 기본은 0
		mickey.age=87;
		//국적, 종교 ,거주지 설정
		mickey.country="미국";
		mickey.religion="무교";
		mickey.address="캘리포니아 주 로스앤젤레스 애너하임 툰 타운";
	
		//미키마우스 할수있는 행위(메서드 호출)
		mickey.sing();
	}

}
