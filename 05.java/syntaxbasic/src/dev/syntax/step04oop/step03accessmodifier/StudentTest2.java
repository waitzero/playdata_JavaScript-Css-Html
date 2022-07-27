package dev.syntax.step04oop.step03accessmodifier;

public class StudentTest2 {

	public static void main(String[] args) {
		// p.165 정보 은닉(information hiding) ?
		
		// 내 시뮬레이션 세계에서 학생이란 8살 부터 26살까지다.
		Student go = new Student("고병민");
//		go.age = 20;
		
		// 기존에 동작하던 프로그램에서는 병민님의 나이가 20살이기 때문에
		// 20살이어서 동작하던 코드
		
		// 해커 침입,
//		go.age = 200; // 직접적인 접근 불가
		
		// 프로그램에서 에러가 발생
		// 대학교에서 인정하는 허용 나이는 20살부터 26살 사이인데, 갑자기 나이가 200살이 되어버리면, 다른 코드와의 충돌이 발생
		// 16번 라인처럼 누군가가 값을 무분별하게 수정하는 이슈가 생길 수 있기 때문에 그런 문제점을 방지하기 위한 하나의 방법으로
		// name 필드를 private으로 지정해서, 값에 대한 직접적인 접근을 막고,
		// setter()를 활용해서 값의 적용 범위를 제한
		
		go.setAge(200); 
	}

}