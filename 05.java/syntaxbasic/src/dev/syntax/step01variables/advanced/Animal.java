package dev.syntax.step01variables.advanced;

public class Animal {
	//멤버 (어떤 클래스가 가지고 있는 구성원들, 필드와 메서드)
	
	//멤버 필드
	int age;//전역변수->멤버 변수
	static String kind;//전역변수->static(정적, 클래스)변수 (필드앞에 static이 붙어있을 경우)
	
	//맴버 메서드
	void intanceMethod() {//인스턴스 메서드(static 키워드가 붙어있지 않기 때문)
		System.out.println(age);
		//인스턴스 메서드가 호출되는 것은 객체가 생성되었다는 것이기 때문에
		//인스턴스 변수인 age역시 사용 가능
		
		System.out.println(kind);
		//static 변수는 항상 인스턴스보다 먼저 메모리에 등록되기 떄문에(먼저 생성되기 떄문에) 사용가능
		staticMethod();
	}
	static void staticMethod() {//static(정적, 클래스) 메서드
//		System.out.println(age); !--age에 에러-->
//		static 영역에 staticMethod()가 올라갈 시점에는 인스턴스가 생성되지 않았을 수 있기 떄문에 사용 불가능
		System.out.println(kind);
//		instanceMethod(); age와 마찬가지
		
		//만약에 여기서 객체(인스턴스)를 생성한다면
		Animal a = new Animal();
		System.out.println(a.age);//인스턴스가 생성되었기 때문에 접근 가능.
		a.intanceMethod();//age와 마찬가지로 가능.
	}

}
