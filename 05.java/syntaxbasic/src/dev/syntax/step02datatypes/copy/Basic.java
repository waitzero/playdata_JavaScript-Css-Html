package dev.syntax.step02datatypes.copy;

public class Basic {

	public static void main(String[] args) {
		//1.���� Ÿ��(Data types)
		
		//1-2.��ǥ���� �⺻(Primitive)Ÿ�Ե�, ���� Ÿ��
		int apples = 7;
		float eyesight =1.5f; //Java����  Float(�Ǽ���)Ÿ���� �ۼ��Ѱ� (1.5)�ڿ� 'f'or'F'���ۼ��ؾ��� 
		//f�� ���� �ʾ��� ���, "Type mismatch: cannot convert from double to float"
		char initialLetter ='Y'; //character�� ����ǥ��, ����Ÿ��, ''(Ȭ����ǥ) ����
		String name = "Yoo";
		boolean isChecked = true;
		
		//1-2. ������ ���� ���
		System.out.println(apples);
		System.out.println(eyesight);
		System.out.println(initialLetter);
		System.out.println(name);
		System.out.println(isChecked);
	}

}
