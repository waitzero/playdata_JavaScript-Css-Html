package dev.todo;

import java.io.IOException;
import java.time.LocalDate;

import dev.todo.controller.TodoController;
import dev.todo.model.Todo;

public class App {

	public static void main(String[] args) throws IOException {		
		// Controller 생성
		TodoController controller = new TodoController();
		
//		controller.findAll();
	
//		controller.findAll();
//		int todoNumber =2;
//		controller.findById(todoNumber);
		
		controller.save(new Todo("밥먹기","밥을 먹는다", LocalDate.of(2022, 8, 6)));
		
		int id =3;
//		controller.updateById(id, new Todo("잠자기", "잠을 잔다", LocalDate.of(2022, 9, 5)));
		
		controller.deleteById(id);
}
}
