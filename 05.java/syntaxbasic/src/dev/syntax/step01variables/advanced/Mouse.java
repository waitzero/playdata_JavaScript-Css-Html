package dev.syntax.step01variables.advanced;

public class Mouse {
	int age;
	String name;//age와 name은 인스턴스 변수, 객체 생성 후에만 사용 가능
	static int countOfTail = 1;//static, 정적 변수, 객체 생선 전에도 사용 가능
	//쥐의 꼬리는 돌연변이가 아닌 이상 모두 1개(값을 다 공유)
	final int LEGS = 4;//상수(Constants), 대문자로 작성
	
}
