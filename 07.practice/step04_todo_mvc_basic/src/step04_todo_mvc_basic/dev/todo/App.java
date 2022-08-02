 package dev.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import dev.todo.model.Todo; // 패키지가 서로 다르면 import

public class App {
	// Java에서 상수는 대문자로 작성
	private static String RESOURCES = "src/resources/";

	public static void main(String[] args) throws IOException {
		// 1. 파일 입출력 기능(역할)
		Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int) numberOfLines;

		// todo 데이터가 3개 있는데, Todo 객체를 담을 Todo타입의 배열
		// 데이터 타입[] 변수명 = new 데이터타입[배열의 길이];
		Todo[] todos = new Todo[rows];

		// 모든 Todo 데이터 읽어들임
		List<String> lines = Files.readAllLines(filePath);
		System.out.println(lines);
		// 반복문을 통해 읽어들인 각각의 todo를 참조변수 todos배열의 요소에 추가
		int index = 0;
		for (String line : lines) {
			String[] columns = line.split("\t");

			// 한 줄 읽어들인 데이터들을 각각 변수에 할당
			int id = Integer.parseInt(columns[0]);// Type mismatch: cannot convert from String to int
			String title = columns[1];
			LocalDate dueDate = LocalDate.parse(columns[2]);
			String description = columns[3];

			// int, String, LocalDate 타입들을 하나의 커스텀 타입인 Todo로 묶어서 관리
			Todo todo = new Todo(id, title, dueDate, description);
			todos[index++] = todo; // [Todo todo1, Todo todo2, Todo todo3];
		}

		// 전체 Todos 조회
		System.out.println(Arrays.toString(todos));

//		for (int i = 0; i < todos.length; i++) {
//			System.out.println(todos[i]);
//		}

		// 할 일 번호(id)로 하나의 Todo를 조회
		int todoNumber = 2;
		for (Todo todo : todos) { // Todo 타입의 todos 배열에서 각 요소가 todo에 할당됨
			if(todo.getId() == todoNumber) {
				System.out.println(todoNumber + " 번에 해당하는 할 일은 " + todo.getTitle() + "입니다.");
			}
		}
	}

}