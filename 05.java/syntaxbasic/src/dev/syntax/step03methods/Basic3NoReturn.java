package dev.syntax.step03methods;

import java.util.Random;

public class Basic3NoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = new Random().nextInt(2);
		if(randomNumber == 0) {
			System.out.println("���� ��������Ʈ�� ��� �����̴���.");
		}else if (randomNumber ==1) {
			System.out.println("���� ������ ���� �����");
		}else if(randomNumber == 2) {
			System.out.println("�� ���� �������ٰ� ");
		}
	}

}
