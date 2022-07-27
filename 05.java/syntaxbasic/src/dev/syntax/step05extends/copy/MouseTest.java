package dev.syntax.step05extends.copy;

public class MouseTest {

	public static void main(String[] args) {
		Mouse jamie = new Mouse(2, "�ϴû�", "�Ͽ���"); // �Ͽ��̿� ��� �ִ� ���̹�
		System.out.println(jamie.getColor());
		
//		jamie.sing(); // Animal Ŭ������ sing() ȣ���(AnimalŬ������ Ư��(age, color, sing())�� ��������,
		// ������ ��� ����?(?)
		
		// ��� ���� �� �� ���ݾ�?
		jamie.sing(); // ����!
		
//		System.out.println(jamie.getColor());
//		System.out.println(jamie.getAge());
		
		
		Mouse jenny = new Mouse(3, "�����", "�Ϻ�");
		jenny.sing(); // ����!
		
		Animal anAnimal = new Animal();
		anAnimal.sing();// ������ ��� ����?
		
		System.out.println(jamie);
		System.out.println(jamie); // "�ȳ��ϼ���? ���� 2���̰�, �ϴû� �Ǻο� �Ͽ��̿� ��ϴ�."
		
		
		
	}

}


