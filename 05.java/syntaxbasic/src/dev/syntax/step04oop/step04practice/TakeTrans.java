package dev.syntax.step04oop.step04practice;

public class TakeTrans {
//�л��� ��ۼ����� Ÿ�� ������ �ϸ鼭 ��ü �� ������ ��� �̷�� ������
	public static void main(String[] args) {
		//�л� 2��
		Student park = new Student("ö�ô�", 5000);
		Student won = new Student ("����", 10000);
		
		//�л��� ������ ������ ����
		//���� ��ü ����, �뼱 ��ȣ�� 100���� ���� ����
		Bus bus100= new Bus(100);//�뼱 ��ȣ�� 100���� ������ ����
		Bus bus200 = new Bus(200);
		//�л��� ������ Ÿ���� ��� �ؾ��ұ�?
		//�л��� ������ ź�ٴ� ���� �ϳ��� ����(method)��� �� �� ����
		//�л� ���忡���� ������ Ÿ�� ���̰�, ������ Ż�� ������ �л� ����
		//�л����� ������ Ÿ�� ������ �ϴ� �޼��带 �ϳ� ����� ����?
		park.takeBus(bus100);
		park.showInfo();
	}

}
