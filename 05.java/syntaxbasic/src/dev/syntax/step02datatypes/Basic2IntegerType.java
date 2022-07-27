package dev.syntax.step02datatypes;

public class Basic2IntegerType {

	public static void main(String[] args) {
	//2. 정수형(양의정수, 0, 음의 정수)
		
	//2-1.정수형 타입의 종류, 왼쪽부터 값을 담을 수 있는 크기가 작음
	//byte, short, int(주로 사용, 사용권장, 기본형), long
	byte a =127; // byte 타입의 값의 허용 범위: -128~ 127,  2의 8제곱(256)
	short b = -32768; //short타입의 값의 허용 범위:-32768~ 32767
	int c = 0; //int 타입의 값의 허용 범위: 약 20억, 정수형을 사용할 때 주로, 기본으로 사용하는 타입
	//	long d = 20000000000; //long 타입의 값의 허용 범위 : 2의 63제곱
	// 2의 63제곱이면 200억 정도는 허용해야 하는데, 에러가 발생
	//int가 정수형에서 기본 타입으로 사용되기 떄문에 작성한 200억은 int형으로 인식되지만, int의 값을 벗어났기 때문에 발생
	long d = 20000000000L;//long타입임을 의미하는 접미사(suffix) l혹은 L을 작성해야함
	//	소문자 1은 숫자1과 혼동될 수 있어서, 대문자 L사용을 권장
	long e = 20_000_000_000L;

	//2-2.각각의 값들을 출력
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}

}
