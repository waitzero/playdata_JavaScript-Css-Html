package dev.syntax.step04oop.step01class;

public class MouseTest {

	public static void main(String[] args) {
		//Ŭ������ ���� ���� ��ü���� ������ �����ؼ� ��ȣ�ۿ��ϴ� �κ�
		//��ü���� ������ �� �ִ� ���� ����
		
		//Type variable = new Ŭ������();
		Mouse mickey = new Mouse();//mickey��� �̸��� �ν��Ͻ� 1�� ����
		System.out.println(mickey.name);//�����Ǳ⺻���� null
		mickey. name = "��Ű���콺";
		System.out.println(mickey.name);
		System.out.println(mickey.age);//int�� �⺻�� 0
		mickey.age=87;
		//����, ���� ,������ ����
		mickey.country="�̱�";
		mickey.religion="����";
		mickey.address="Ķ�����Ͼ� �� �ν��������� �ֳ����� �� Ÿ��";
	
		//��Ű���콺 �Ҽ��ִ� ����(�޼��� ȣ��)
		mickey.sing();
	}

}
