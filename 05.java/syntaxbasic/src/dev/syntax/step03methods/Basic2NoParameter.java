package dev.syntax.step03methods;

import java.util.Random;

public class Basic2NoParameter {

	public static void main(String[] args) {
		/*
		 * 2. �Ķ���Ͱ� ���� �޼���
		 * 
		 * ���Ǳ⿡ ������, ���ϴ� ���Ḧ ������ �� �ִ� ��ư�� ����, ���� �̱� ��ư�� �־���.
		 * ���� ���Ǳⰰ��.
		 * 
		 * ����� �̸�(���ڿ�)�� ��ȯ�ϴ� �޼��� drinkMachine() { 
		 * 	����(0,1,2)���� ���Ḧ ��ȯ�ϵ��� �ۼ� 
		 * 	
		 *  ���� ����� ��� �ִ� �迭 availableDrinkArray ����
		 *   
		 * } 
		 */
		
		System.out.println(drinkMachine()); // ��������! 
		
	}
	
	public static String drinkMachine() { // ������ �Ű������� ����
		Random random = new Random(); // Ctrl + Shift + O(import)
		int randomNumber = random.nextInt(2); // 0 ~ 2 ������ �������� ����
		String[] availableDrinkArray = {"��������Ʈ", "��������", "��"};
		// Java���� �迭(array)�� ������ Ÿ���� ���� ���� �� ���� [] : �迭Ÿ�� ǥ���
		// String[] -> ���ڿ� ���� ���� �� �ִ� ���ڿ� �迭
		// int[] -> �������� ���� �� �ִ� ������ �迭
		
		return availableDrinkArray[randomNumber];
	}
}