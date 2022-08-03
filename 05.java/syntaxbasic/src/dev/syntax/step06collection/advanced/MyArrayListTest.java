package dev.syntax.step06collection.advanced;
import java.util.ArrayList;
import java.util.List;
public class MyArrayListTest {
	public static void main(String[] args) {
		// 이미 Java에서 제공하는 구현 클래스인 ArrayList 사용
		 List<String> list = new ArrayList<>();
		
//		testConstructor();
//		testSize();
//		testAddWithParameter();
		
		List<String> letters = new MyArrayList<>();
		
		// 요소 추가
		String[] letterArray = { "일", "이", "삼", "사", "오", "육", "칠", "팔", "구", "십" };
		// forEach 반복문으로 letters라는 리스트에 letterArray에 있는 요소들 하나씩 추가
		for (String letter : letterArray) {
			letters.add(letter);
		}
		System.out.println(letters);
		System.out.println("---------------------------------------------------------------");
		
//		testAddWithOverSize(letters);
	}
	
	// 생성자 테스트 메서드
	public static void testConstructor() {
		List<String> fruits = new MyArrayList<>();
		System.out.println(fruits);
	}
	// size()
	public static void testSize() {
		List<String> fruits = new MyArrayList<>();
		System.out.println(fruits.size());
	}
	
	// add(E element)
	public static void testAddWithParameter() {
		List<Integer> numbers = new MyArrayList<>();
		numbers.add(5);
		numbers.add(4);
		System.out.println(numbers);
	}
	
	// add(E element), 사이즈가 배열의 허용 공간(length)을 초과했을 때
	public static void testAddWithOverSize(List<String> letters) {
		letters.add("열하나");
		System.out.println(letters);
	}
	
	// add(int index, E element)
	public static void testAddWithParameters(List<String> letters) {
		letters.add(2, "이와 삼 사이");
		System.out.println(letters);
	}
}