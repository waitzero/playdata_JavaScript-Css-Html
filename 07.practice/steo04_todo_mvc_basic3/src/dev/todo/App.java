
package dev.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import dev.todo.data.TodoTSVParser;
import dev.todo.data.TodoTSVWriter;
import dev.todo.model.Todo; // 패키지가 서로 다르면 import

public class App {
	// Java에서 상수는 대문자로 작성
	private static final String RESOURCES = "src/resources/";

	public static void main(String[] args) throws IOException {
		// 1. 파일 입출력 기능(역할)
		final Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int) numberOfLines;

		List<String> lines = Files.readAllLines(filePath);
		
		TodoTSVParser parser = new TodoTSVParser();
		Todo[] todos = parser.parseLinesFromTSV(lines, rows);
		
		// 전체 Todos 조회
		findAll(todos);
				
		// 할 일 번호(id)로 하나의 Todo를 조회
		int todoNumber = 2;
		System.out.println(findById(todos, todoNumber));
		
		// 할 일을 추가하는 부분을 별도의 클래스 TodoTSVWriter.java에 작성
		TodoTSVWriter writer = new TodoTSVWriter();
		Todo newTodo = new Todo(todoNumber, "산책하기", LocalDate.of(2022, 04, 05), "강아지와 산책한다.");
		writer.save(RESOURCES, filePath, newTodo);
	}
	
	// 전체 Todos 조회
	public static void findAll(Todo[] todos) {
		System.out.println(Arrays.toString(todos));		
	}
	
	// 할일 번호(id)로 하나의 Todo 조회
	public static Todo findById(List<> todos, int todoNumber) {
		for (Todo todo : todos) { // Todo 타입의 todos 배열에서 각 요소가 todo에 할당됨
			if(todo.getId() == todoNumber) {
				return todo;
			}
		}
		return null;
	}

}
