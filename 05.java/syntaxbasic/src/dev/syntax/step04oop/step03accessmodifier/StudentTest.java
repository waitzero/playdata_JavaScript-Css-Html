
package dev.syntax.step04oop.step03accessmodifier;

public class StudentTest {

	public static void main(String[] args) {
//		Student jji = new Student();
//		jji.name = "�����ϴ�"; // The field Student.name is not visible
		
		
		// � ��ü�� �ʵ� ���� ����(����)�ϴ� ��� 2����
		// 1. ������ �޼��带 ���� ����
		Student jji = new Student("�����ϴ�");
//		System.out.println(jji.name); // The field Student.name is not visible 
		// -> �ʵ���� ������ �Ұ�������
		
		System.out.println(jji.getName()); // �����ϴ�
		
		// 2. setter()�� ���� ����
		// Student.java�� setName(String name)�޼��� �ۼ�, �̸��� ������ �� �ִ� ���
		// ������ ��ȯ Ÿ���� ����, ���� �����ڴ� public
		
		// setName()ȣ���ؼ� "�����ϴ�"�� "������"�� ����
		jji.setName("������");
		// getName()ȣ���ؼ� ���� ���� ���� Ȯ��
		System.out.println(jji.getName());
	}

}


