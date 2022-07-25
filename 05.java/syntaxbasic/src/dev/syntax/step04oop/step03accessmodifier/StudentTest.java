
package dev.syntax.step04oop.step03accessmodifier;

public class StudentTest {

	public static void main(String[] args) {
//		Student jji = new Student();
//		jji.name = "정정일님"; // The field Student.name is not visible
		
		
		// 어떤 객체에 필드 값을 세팅(설정)하는 방법 2가지
		// 1. 생성자 메서드를 통한 설정
		Student jji = new Student("정정일님");
//		System.out.println(jji.name); // The field Student.name is not visible 
		// -> 필드로의 접근이 불가능해짐
		
		System.out.println(jji.getName()); // 정정일님
		
		// 2. setter()를 통한 설정
		// Student.java에 setName(String name)메서드 작성, 이름을 설정할 수 있는 기능
		// 별도의 반환 타입은 없음, 접근 제어자는 public
		
		// setName()호출해서 "정정일님"을 "정정일"로 수정
		jji.setName("정정일");
		// getName()호출해서 설정 적용 여부 확인
		System.out.println(jji.getName());
	}

}


