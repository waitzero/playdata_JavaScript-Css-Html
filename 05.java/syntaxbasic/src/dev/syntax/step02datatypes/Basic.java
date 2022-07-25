package dev.syntax.step02datatypes;

public class Basic {

	public static void main(String[] args) {
		//1.값의 타입(Data types)
		
		//1-2.대표적인 기본(Primitive)타입들, 원시 타입
		int apples = 7;
		float eyesight =1.5f; //Java에서  Float(실수형)타입은 작성한값 (1.5)뒤에 'f'or'F'를작성해야함 
		//f를 쓰지 않았을 경우, "Type mismatch: cannot convert from double to float"
		char initialLetter ='Y'; //character의 줄임표현, 문자타입, ''(홑따옴표) 가능
		String name = "Yoo";
		boolean isChecked = true;
		
		//1-2. 각각의 값을 출력
		System.out.println(apples);
		System.out.println(eyesight);
		System.out.println(initialLetter);
		System.out.println(name);
		System.out.println(isChecked);
	}

}
