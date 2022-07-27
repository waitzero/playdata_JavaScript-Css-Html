package dev.syntax.step04oop.step04practice;

public class TakeTrans {
//학생이 운송수단을 타는 행위를 하면서 객체 간 협력이 어떻게 이루어 지는지
	public static void main(String[] args) {
		//학생 2명
		Student park = new Student("철련님", 5000);
		Student won = new Student ("혜민", 10000);
		
		//학생이 버스를 탔으면 좋겠
		//버스 객체 생성, 노선 번호가 100번인 버스 생성
		Bus bus100= new Bus(100);//노선 번호가 100번인 버스가 생성
		Bus bus200 = new Bus(200);
		//학생이 버스를 타려면 어떻게 해야할까?
		//학생이 버스를 탄다는 것은 하나의 행위(method)라고 볼 수 있음
		//학생 입장에서는 버스를 타는 것이고, 버스를 탈지 말지는 학생 결정
		//학생에게 버스를 타는 행위를 하는 메서드를 하나 만들어 볼까?
		park.takeBus(bus100);
		park.showInfo();
	}

}
