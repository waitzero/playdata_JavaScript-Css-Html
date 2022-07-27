package dev.syntax.step04oop.step03accessmodifier;

public class Student {
	int id;
	private String name;
	// Student Ŭ���� ���忡�� StduentTest.java, ������ ������ �ٸ� ��� Ŭ�������� �ܺ� Ŭ������� ��
	// private�̶�� ���� �����ڸ� �ۼ��ϸ� �ش� �ʵ�� �ڱ� �ڽŸ� ���� �����ϰ� ��
	int grade;
	String address;
	private int age;

	// name�� �Ű������� �޴� ������
	public Student(String name) {
		// ���������� �ӽ� ������ String name = "�����ϴ�";��� �ڵ尡 ����
		this.name = name;
	}

	// �̸� �ʵ��� ���� ��ȯ�ϴ� �Ϲ� �޼���
//	public String pleaseName() {
//		return name;
//	}

	// get : ���𰡸� ���, name: �ʵ��, get + name�� camelCase�� �ۼ�
	// -> getter �޼��� (getter()), � ���� ������ �ִ� ���(����, ���)
	public String getName() {
		return name;
	}

	// set : ����, setting, name : �ʵ��, set + name�� camelCase�� �ۼ�
	// -> setter(), � ���� �������ִ� ���(����, ���)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		// �ٸ� �ڵ嵵 �ۼ� ����
		if(age >= 8 && age <= 26) {
			this.age = age;			
		} else {
			System.out.println("���� ���Ͻô� �ſ���?");
		}
	}
}
