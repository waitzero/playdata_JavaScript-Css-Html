package dev.syntax.step01variables.basic;

public class Basic {//Ŭ���� �̸��� �׻� �빮��(Uppercase)
					
	public static void main(String[] args) {
		//1. ������ ����, ����� �ʱ�ȭ�� ������
		
		//1-1.������ ����
		int a;//Integer�� ���� ǥ��, "���� ��  ���� a ����"
//		System.out.println(a);//The local variable a may not have been initialized(������ �ʱ�ȭ�� �ȵ�����)
		
		//1-2.������ �ʱ�ȭ
		a=5;//���� �� 5�� �Ҵ�
		
		//2.������ �̸� ����(Variable Naming Convention)
		//���������� ����� ������, �Ϲ����� ��Ģ or ���ʻ� ������� �ʴ� ���̽��� ����
		
		//2-1.������(��ҹ���), ������ ��ǻ� �ҹ��ڷ� ����(camelCase)
		int alphabet =26; //The value of the local variable alphabet is not used
//		System.out.println(alphabet); ����ϸ� warning�����
		
		int Upper =5;
		
		//2-2.Ư������($, _(underbar)��ȣ�� �ش�, !#@ ���� �Ұ���), ���Ž� �ڵ� �� �ý��� ���� �ڵ忡�� �ַ� ���
		int $isLogin = 0;//���������� ������ �ϴ�.
		int _isLogin = 0;
		
		//2-3. ���ڷ� ������ �� ����
//		int 5 = 5; //?
		
		//2-4. Keyword(�����) ��� �Ұ�(while, int for, break, class ��)
//		int int = 5;
	}

}
