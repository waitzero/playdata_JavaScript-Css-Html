package dev.syntax.step02datatypes.copy;

public class Basic7Encoding {

	public static void main(String[] args) {
		//��ǻ�Ϳ��� ��� ������ �ᱹ 0�� 1�� byte�� ó���Ǵµ�, ���ڴ� ��� ó���Ǵ� �ɱ�?
		//java���� �ۼ��� char Ÿ����?
		char firstLetter='A';
		System.out.println(firstLetter);
		
		//����� ���ڴ� �޸� �� �ᱹ ����(����)�� ��ȯ��
		int castedValue = firstLetter;
		System.out.println(castedValue);// �ƽ�Ű �ڵ�
		
		//ASCII �ڵ尪�� 65�� char�� ���� �����ص� ������� ����
		char sameWithCastedValue = 65;
		System.out.println(sameWithCastedValue);

	}

}
