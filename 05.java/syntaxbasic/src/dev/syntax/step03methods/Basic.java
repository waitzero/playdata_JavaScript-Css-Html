package dev.syntax.step03methods;

public class Basic {

	public static void main(String[] args) { // ���� �߰�ȣ : �޼����� ����
		// 1. Java������ �Լ� ��� �޼���(Method)��� �� ����Ѵ�.
		
		/*
		 * ������ �ʹ� ������ ������ �� ������
		 * ���Ǳ⸦ ã�� ��� ������ ���Ǳ�� �پ��.
		 */
		
		String myDrink = drinkMachine(3); // �޼��� ���� ȣ��
		System.out.println(myDrink); // ������ ����
		
//		System.out.println(drinkMachine(2));
		
	} // �ݴ� �߰�ȣ : �޼����� ��
	
	// ���������� ��ȯŸ�� �޼����(�Ķ���� ����) { ������ �ڵ� �ۼ� �κ� }
	public static String drinkMachine(int number) { // �޼��� ����(����)��
		
		System.out.println("����� ����!");
		// �޼��� ������
		String drink = null; // ���� �Ҵ���� �ʾҴٴ� �ǹ̸� ���ϴ� null keyword
		
		if (number == 1) {
			drink = "���� �ݶ�";
		} else if (number == 2) {
			drink = "��������Ʈ";
		} else if (number == 3) {
			drink = "���� ����";
		} else {
			drink = "���� ���Ͻô� �ǰ���?";
		}
		
		return drink;
		
//		return ""; // empty string���� ������ ���� �Ͻ������� �ذ�, This method must return a result of type String 
	}
}

