package dev.syntax.step04oop.step04practice;

public class Student {
	//�ɹ� �ʵ�
	public String StudentName;// �̸�
	public int grade;// �г�
	public int money;// �뵷
	
	//������
	public Student(String studentName, int money) {
		StudentName = studentName;
		this.money = money;
	}

	//�Ϲ� �޼���, �л��� ������ Ÿ�� ���
	public void takeBus(Bus bus) {
//		System.out.print(StudentName+"��! �л��Դϴ�.");
//		������ Ÿ�� �л��� �ؾ� �� ��
//		1.�л��� ���� �����ؾ���
//		������������ �°��� ���� ���� or "��簡 ���� ���� ����"
		//1-1������ �󸸵�?
		bus.take(1000); //�л��� ����� �����ϴ� 
		//1-2�л��� ���� �ܰ��� ������ ������ ��ŭ ���� ����
		//�л��� 100�� ������ ���� ���, ���������� ������ ���� �ڵ尡 �����
		//String bus = bus100; 200�� ������ �ƴϰ� 100�� ������ ��� �ִ� ���� ������ ����
		this.money-= 1000;
	}

	public void showInfo() {
		System.out.println(String.format("����"+StudentName+"���� �ܰ�� "+money+"�Դϴ�"));
	}	
}
