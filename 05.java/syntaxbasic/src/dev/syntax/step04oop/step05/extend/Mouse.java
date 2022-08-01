package dev.syntax.step04oop.step05.extend;

public class Mouse extends Animal {// ���(inheritance)�� keyword(�����) : extends
	
	// extends Ű���带 �Ἥ ��� ���踦 �����ϸ� ���� Ŭ����(Animal)�� �ʵ带 ���� Ŭ����(Mouse)������ ����� �� �ִ�.
	// ���� ������ ������, �ۼ��Ǿ� ����
	// public int age;
	// public String color;
	
	// ��� ������(String address)�� ������ ��
	private String address;
	
	// �Ű������� ��ü �� �޴� ������
	public Mouse(int age, String color, String address) {
		// super(), ���� Ŭ������ �����ڸ� ȣ���ϴ� �޼���, ���� Ŭ������ ������ �߿����� �⺻ �����ڸ� ȣ�� �޼���
		//String color = "�ϴû�";
		//String address = "�Ͽ���";
		super(age, color); // super class constructor(), ���� Ŭ������ ������ �߿����� �� �ʵ带 �Ű������� �޴� ������ ȣ�� �޼��� 
		this.address = address;
	}
	
	// jamie�� �ڽŸ��� ��� ����� ���Ӱ� ������(overriding)
	public void sing() {
		System.out.println("����!");
	}
	
}