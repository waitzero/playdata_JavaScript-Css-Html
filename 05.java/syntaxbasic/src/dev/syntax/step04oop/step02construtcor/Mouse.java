package dev.syntax.step04oop.step02construtcor;

public class Mouse {
	int age;//���� ����
	String name;//���� �̸�

//	������(constructor)-������ �޼���
//	new �����ڿ� �Բ� ���Ǹ�, � ��ü�� �ν��Ͻ��� ���� �� ���
//	������ �ۼ� ��Ģ
//	 1.������ ��ȯ Ÿ���� ����(���������� void�� ����)
//	 2.������ �޼����� �̸��� Ŭ������ �̸��� ����(�빮�ڱ��� �����ϰ�)
//	 3.������ �����ڸ� �ۼ��� �� �ִ�.
//	  3-1.������ �����ε�
//	      ->�޼����� �̸��� �����ϰ�, �Ű������� ���� or Ÿ��, �ۼ� ������ �ٸ� ��� �ߺ��ؼ� �ۼ� ����
	
	
	
//	//�㰡 ��� ������ �ϴ� �޼���
//	 public void sing() {System.out.println("����~");}//Duplicate method sing() in type Mouse
//	 public void sing() {System.out.println("±��~");}//�޼��� �̸��� �ߺ��Ǽ�. ���ÿ� �ۼ� �Ұ���
	 
	 
	//�Ű����� �� �ϳ��� ���� �����ڸ� �⺻ �����ڶ�� ��
	public Mouse() {}
//	public Mouse() {}//�Ű��������� �����ϴϱ� �ߺ� �ۼ� �Ұ���
	//age�� �Ķ���ͷ� ���� ������
	public Mouse(int age) {
		this.age = age;
	}
	public Mouse(String name) {
		this.name = name;
	}
	public Mouse(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

