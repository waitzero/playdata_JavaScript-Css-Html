package dev.syntax.step04oop.step04practice;

public class Bus {
	public int busNumber;// ������ȣ
	public int passengerCount;// ���� �°� ��
	public int busMoney;// ������ ����
	// ������ ��ȣ�� ������ ������ ���� ����

	public Bus(int busNumber) {
		this.busNumber = busNumber;

	}
	public void take(int money) {
		//�°��� ������ Ÿ�� ������ �ؾ�����
		//1.�°����Լ� ���� ����
		//2.���� �� ��ŭ ������ ���� ����
		//3.�°� �� ����
		busMoney+=money;
		passengerCount++;
	}
}
