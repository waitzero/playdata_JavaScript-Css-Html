package dev.syntax.step03methods;

import java.util.Random;

public class Basic3NoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = new Random().nextInt(2);
		if(randomNumber == 0) {
			System.out.println("현재 스프라이트의 재고가 없다이누마.");
		}else if (randomNumber ==1) {
			System.out.println("닥터 페퍼의 제고 없어용");
		}else if(randomNumber == 2) {
			System.out.println("아 ㅋㅋ 물도없다고 ");
		}
	}

}
