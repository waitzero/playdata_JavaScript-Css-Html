package dev.syntax.step04oop.step01class;

public class MouseTest2 {

	public static void main(String[] args) {
		//jerry�ν��Ͻ� ����
		Mouse jerry = new Mouse();//Mouse()������ �ż��� ȣ��
		jerry.name ="����";
		jerry.age = 73;
		jerry.address="����";
//		jerry.color= "����";//�������� ���� �Ұ�, MouseŬ������ �ۼ��Ǿ� �ִ� �ʵ常 Ȱ�� ����
		
		//Mouse mickey = new Mouse("��Ű���콺", "�̱�", 85, "����", "�÷θ�����");
		Mouse mickey = new Mouse("��Ű���콺", "�̱�", 85, "����", "�÷θ�����");
		System.out.println(mickey.name);
		System.out.println(mickey.country);
		System.out.println(mickey.age);
		
		System.out.println(jerry);
		System.out.println(mickey);
	}

}
