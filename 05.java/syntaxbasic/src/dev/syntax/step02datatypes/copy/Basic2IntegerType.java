package dev.syntax.step02datatypes.copy;

public class Basic2IntegerType {

	public static void main(String[] args) {
	//2. ������(��������, 0, ���� ����)
		
	//2-1.������ Ÿ���� ����, ���ʺ��� ���� ���� �� �ִ� ũ�Ⱑ ����
	//byte, short, int(�ַ� ���, ������, �⺻��), long
	byte a =127; // byte Ÿ���� ���� ��� ����: -128~ 127,  2�� 8����(256)
	short b = -32768; //shortŸ���� ���� ��� ����:-32768~ 32767
	int c = 0; //int Ÿ���� ���� ��� ����: �� 20��, �������� ����� �� �ַ�, �⺻���� ����ϴ� Ÿ��
	//	long d = 20000000000; //long Ÿ���� ���� ��� ���� : 2�� 63����
	// 2�� 63�����̸� 200�� ������ ����ؾ� �ϴµ�, ������ �߻�
	//int�� ���������� �⺻ Ÿ������ ���Ǳ� ������ �ۼ��� 200���� int������ �νĵ�����, int�� ���� ����� ������ �߻�
	long d = 20000000000L;//longŸ������ �ǹ��ϴ� ���̻�(suffix) lȤ�� L�� �ۼ��ؾ���
	//	�ҹ��� 1�� ����1�� ȥ���� �� �־, �빮�� L����� ����
	long e = 20_000_000_000L;

	//2-2.������ ������ ���
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}

}
