package dev.syntax.step04oop.step04practice;

public class Student {
	//맴버 필드
	public String StudentName;// 이름
	public int grade;// 학년
	public int money;// 용돈
	
	//생성자
	public Student(String studentName, int money) {
		StudentName = studentName;
		this.money = money;
	}

	//일반 메서드, 학생이 버스를 타는 기능
	public void takeBus(Bus bus) {
//		System.out.print(StudentName+"삑! 학생입니다.");
//		버스를 타면 학생이 해야 할 일
//		1.학생이 돈을 지불해야함
//		버스를탔으면 승객이 돈을 지불 or "기사가 직접 돈을 수금"
		//1-1버스비가 얼만데?
		bus.take(1000); //학생이 비용을 지불하는 
		//1-2학생이 가진 잔고에서 지불한 버스비 만큼 돈을 차감
		//학생이 100번 버스를 탔을 경우, 내부적으로 다음과 같은 코드가 실행됨
		//String bus = bus100; 200번 버스도 아니고 100번 버스를 담고 있는 참조 변수가 들어옴
		this.money-= 1000;
	}

	public void showInfo() {
		System.out.println(String.format("현재"+StudentName+"님의 잔고는 "+money+"입니다"));
	}	
}
