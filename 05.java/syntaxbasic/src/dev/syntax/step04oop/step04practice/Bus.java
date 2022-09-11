package dev.syntax.step04oop.step04practice;

public class Bus {
	public int busNumber;// 버스번호
	public int passengerCount;// 버스 승객 수
	public int busMoney;// 버스의 수입
	// 버스의 번호만 가지고 버스를 먼저 생성 한다

	public Bus(int busNumber) {
		this.busNumber = busNumber;

	}
	public void take(int money) {
		//승객이 버스에 타면 버스가 해야할일
		//1.승객에게서 돈을 취함
		//2.받은 돈 만큼 버스의 수익 증가
		//3.승객 수 증가
		busMoney+=money;
		passengerCount++;
	}
}
