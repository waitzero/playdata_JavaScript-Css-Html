package dev.syntax.step04oop.step01class;

public class MouseTest2 {

	public static void main(String[] args) {
		//jerry인스턴스 생성
		Mouse jerry = new Mouse();//Mouse()생성자 매서드 호출
		jerry.name ="제리";
		jerry.age = 73;
		jerry.address="뉴욕";
//		jerry.color= "갈색";//동적으로 생성 불가, Mouse클래스에 작성되어 있는 필드만 활용 가능
		
		//Mouse mickey = new Mouse("미키마우스", "미국", 85, "무교", "플로리다주");
		Mouse mickey = new Mouse("미키마우스", "미국", 85, "무교", "플로리다주");
		System.out.println(mickey.name);
		System.out.println(mickey.country);
		System.out.println(mickey.age);
		
		System.out.println(jerry);
		System.out.println(mickey);
	}

}
