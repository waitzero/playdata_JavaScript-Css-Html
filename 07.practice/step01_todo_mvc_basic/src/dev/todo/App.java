package dev.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class App {
	// Java에서 상수는 대문자로 작성
	private static String RESOURCES = "src/resources/";

	public static void main(String[] args) throws IOException {
		// 파일을 읽어들이기 위해서는 Path라는 인터페이스(다음 주 설명) 활용
		
		// Cannot make a static reference to the non-static field RESOURCES
		Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		//파일 라인수 세기 
//		Files.lines(path).count(); 
//		numberOfLines의 타입은Long= lines() 메소드는 파일에서 모든 line을 읽어서 Stream으로 리턴하고, count() 메소드는 Stream의 element 갯수를 리턴합니다.
		long numberOfLines = Files.lines(filePath).count();
		//파일 라인수의 개수를 rows라는 정수에 저장
		int rows = (int)numberOfLines;
		
		//할 일 번호들
		int[] todoNumbers = new int[rows];
		//할 일 제목들
		String[] todoTitles = new String[rows];
		//할 일 내용들
		String[] todoDescriptions = new String[rows];
		//할 일 날짜들
		LocalDate[] todoDueDate = new LocalDate[rows]; // import: Ctrl + Shift + O
		
		// lines 라는 이름의 리스트에는 String 타입만 들어갈 수 있음(<>, generic)
		List<String> lines = Files.readAllLines(filePath);
		/* lines = ["1	숙제하기	2022-03-05	수학,영어 숙제"   ---> 0번째 요소
					"2	밥 먹기 ~~" 						   ---> 1번째 요소
					]
		*/
		System.out.println(lines.get(0)); // get(int index), 리스트의 첫 번째 인덱스의 값 조회
		
		int index = 0;
		for (String line : lines) { // lines 리스트 내에 있는 요소 1개(한 줄)가 line이라는 변수에 할당
			String[] columns = line.split("\t"); // tab으로 각각 구분된 데이터들을 분리해서 문자열 배열에 순서대로 할당
//			System.out.println(columns[0]);
//			System.out.println(columns[1]);
//			break;
			
			// 읽어들인 각각의 데이터  Integer.parseInt(String 타입의 값)
			int id = Integer.parseInt(columns[0]);// Type mismatch: cannot convert from String to int
			String title = columns[1];
			LocalDate dueDate = LocalDate.parse(columns[2]);
			String description = columns[3];
			
			// 배열에 읽어들인 데이터 각각 추가
			// numbers[0] = 5;
			todoNumbers[index] = id;
			todoTitles[index] = title;
			todoDescriptions[index] = description;
			todoDueDate[index] = dueDate;
			index++;
		}
		
		// 전체 Todos 조회
		for (int i = 0; i < index; i++) {
			// 1번 째로 해야 할 일은 숙제하기이고, 할 일 내용은 수학, 영어 숙제입니다. 기한은 2022-03-05까지 입니다.
			System.out.printf("%d번 째로 해야할 일은 %s이고, 할일 내용은 %s이다 기한은 %s까지 입니다. \n",todoNumbers[i],todoTitles[i],todoDescriptions[i],todoDueDate[i]);
		}
		
	}

}
