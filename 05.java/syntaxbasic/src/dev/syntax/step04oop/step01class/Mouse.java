package dev.syntax.step04oop.step01class;

public class Mouse {//�� Ŭ������ �ۼ�
	//�㿡 ���� �Ӽ��� ������ ����ϴ� �κ�
	
	//Member ?� Ŭ������ ������
	//��(Mouse)�� �Ӽ�
	int age;//���� ����
	String name;//���� �̸�
	String country;//���� ����
	String religion;//�㰡 ��� �ִ� ����
	String address;//�㰡 ��� �ִ� �ּ�
	
	//Mouse�� ����(Method)
	void sing() {
		System.out.println(name+"����");
		//name�� mickey�� ������ ����(MouseTest.java����)
		//���� Ŭ���� �������� �Ӽ�, ������ �����Ӱ� ����(���) ����
	}
	//������(�޼���), Constructor, class�̸��� ����
	//Mouse()�� �Ķ���ͷ� �ƹ��͵� ���� �����ڸ� �⺻ ������(default constructor)
	public Mouse() {
		System.out.println("Mouse()ȣ��");
	}
	//�Ű������� �ִ� ������
	public Mouse(String mouseName, String country, int age, String religion, String address) {
//		System.out.println("�Ű������� �ִ� ������ ȣ��");
		name = mouseName;
//		country = country;// 5=5;
		this.country = country; //this(�ڱ��ڽ�) =mickey
		this.age=age;
		this.religion = religion;
		this.address = address;
	}
}
