package dev.syntax.step06collection.basic;

public class MouseTest {

	public static void main(String[] args) {
		Mouse mini = new Mouse(10, "미니", "하와이", "구직중");
		Mouse mickey = new Mouse(25, "미키", "런던", "맨체스터 유나이티드");
		Mouse jay = new Mouse(15, "제이", "상하이", "텐센트");
		Mouse jerry = new Mouse(20, "제리", "도쿄", "라인");
		Mouse jamie = new Mouse(40, "제이미", "대한민국", "삼성");

		//mice라는 길이가 5인 고정길이 배열 생성, 쥐 5마리를 요소로 추가
		
		Mouse[] mice = new Mouse[5];
		mice[0] = mini;
		mice[1] = mickey;
		mice[2] = jay;
		mice[3] = jerry;
		mice[4] = jamie;
	
	for(Mouse mouse: mice) {
		System.out.println(mouse);
	}
	System.out.println();
	//쥐의 정보를 수정- jay의 거주지를 프랑스, 회사를 루브르 박물관으로 변경후 확인
	jay.setAddress("프랑스");
	jay.setCompany("루브르 박물관");
	//조화
	System.out.println(jerry.getCompany());
	//삭제
	mice[2] =null;
	System.out.println(mice.length);
	}
	
	}

		
	
	


