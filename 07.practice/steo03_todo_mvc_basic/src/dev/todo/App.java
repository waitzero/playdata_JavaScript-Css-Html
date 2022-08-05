package dev.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import dev.todo.data.TodoTSVParser;
import dev.todo.model.Todo; // 패키지가 서로 다르면 import

public class App {
	// Java에서 상수는 대문자로 작성
	private static final String RESOURCES = "src/resources/";

	public static void main(String[] args) throws IOException {
		// 1. 파일 입출력 기능(역할)
		final Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int) numberOfLines;

		// 모든 Todo 데이터 읽어들임
		List<String> lines = Files.readAllLines(filePath);
		System.out.println(lines);
		
		TodoTSVParser parser = new TodoTSVParser();
		List<Todo> todos = parser.parseLinesFromTSV(lines,rows);

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
	public void  findAll(Todo[] todos){
		
		System.out.println(Arrays.toString(todos));
	}
	public static Todo  findById(Todo[] todos, int todoNumber){
		for (Todo todo : todos) { // Todo 타입의 todos 배열에서 각 요소가 todo에 할당됨
			if(todo.getId() == todoNumber) {
				System.out.println(todoNumber + " 번에 해당하는 할 일은 " + todo.getTitle() + "입니다.");
			}
		}
		return null;
	}
}
