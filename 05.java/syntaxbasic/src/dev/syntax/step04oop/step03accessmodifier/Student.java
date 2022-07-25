package dev.syntax.step04oop.step03accessmodifier;

public class Student {
	int id;
	private String name;
	// Student 클래스 입장에서 StduentTest.java, 본인을 제외한 다른 모든 클래스들을 외부 클래스라고 함
	// private이라는 접근 제어자를 작성하면 해당 필드는 자기 자신만 접근 가능하게 됨
	int grade;
	String address;
	private int age;

	// name을 매개변수로 받는 생성자
	public Student(String name) {
		// 내부적으로 임시 변수인 String name = "정정일님";라는 코드가 생김
		this.name = name;
	}

	// 이름 필드의 값을 반환하는 일반 메서드
//	public String pleaseName() {
//		return name;
//	}

	// get : 무언가를 얻다, name: 필드명, get + name을 camelCase로 작성
	// -> getter 메서드 (getter()), 어떤 값을 가져다 주는 사람(역할, 기능)
	public String getName() {
		return name;
	}

	// set : 설정, setting, name : 필드명, set + name을 camelCase로 작성
	// -> setter(), 어떤 값을 설정해주는 사람(역할, 기능)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		// 다른 코드도 작성 가능
		if(age >= 8 && age <= 26) {
			this.age = age;			
		} else {
			System.out.println("지금 뭐하시는 거에요?");
		}
	}
}
