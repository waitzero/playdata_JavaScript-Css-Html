package dev.syntax.step06collection.basic;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("고양이");
		set.add("토끼");
		set.add("거북이");
		set.add("고양이");
		set.add("고래");
		
		// set에 저장된 총 객체의 수 확인
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		// 고래라는 객체가 존재하는지(containing) 여부 확인
		System.out.println(set.contains("고래"));
		
		// 고양이 객체 삭제 완료 여부
		System.out.println(set.remove("고양이"));
		
		// 삭제 후 총 객체의 수
		System.out.println(set.size());
		
		// set 내 모든 객체 제거
		set.clear();
		
		if (set.isEmpty()) System.out.println("비어 있음");
	}
}