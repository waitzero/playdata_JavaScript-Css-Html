package dev.syntax.step06collection.basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		Mouse mini = new Mouse(10, "미니", "하와이", "구직중");
		Mouse mickey = new Mouse(25, "미키", "런던", "맨체스터 유나이티드");
		Mouse jay = new Mouse(15, "제이", "상하이", "텐센트");
		Mouse jerry = new Mouse(20, "제리", "도쿄", "라인");
		Mouse jamie = new Mouse(40, "제이미", "대한민국", "삼성");
 
		ArrayList mice = new ArrayList();//지네릭 적용 전
		
//		List list = new ArrayList();
//		List list = new List();
//		List list2 = new LinkedList();
		//인스턴스 불가능
		System.out.println(mice.size());
		//요소 추가
		mice.add(mini); 
		mice.add(mickey);
		mice.add(jay);
		mice.add(jerry);
		mice.add(jamie);
		//전체 요소 개수 조회
		System.out.println("mice 리스트의 요소 개수 :"+ size());
			
		//1번째 인덱스에 들어있는 값 조회
		Mouse jerryMan = (Mouse)mice.get(0);
		//제리의 거주지 필드만 조회
//	System.out.println(jerryMan.getAddress());
	//3번쨰 요소 삭제 remove(int index)
		mice.remove(3);
	//전체 요소 조회
		System.out.println("전체 리스트 조회"+size());
		//제리의 나이를 21살로 수정
//		jerry.setAge(21);
		//제리의 나이만 조회
		System.out.println("제리의 나이는?"+jerry.getAge());
		//새로운 쥐 '지니'
	  Mouse jinnie = new Mouse(30, "지니", "대한민국", "스타벅스");
	  //
	
	}

	private static String size() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
