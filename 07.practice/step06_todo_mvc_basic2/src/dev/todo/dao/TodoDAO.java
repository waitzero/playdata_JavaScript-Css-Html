package dev.todo.dao;

import java.util.List;

import dev.todo.database.TodoDatabase;
import dev.todo.model.Todo;

public class TodoDAO {
	//db에 접근하는 역할(db에 접근용 코드 작성 부분)
	//현재 step 06에서 db는 todoDatabase.java

	private TodoDatabase todoDatabase;
	public TodoDAO() {//생성자로 todoDatabase필드 초기화
		todoDatabase = TodoDatabase.getInstance();
	}
	public void findALL() {
		// TODO Auto-generated method stub
		System.out.println(todoDatabase.getTododata());
	}
	public List<Todo> findAll(){
		return TodoDatabase.getTododata();
	}
	public Todo findById(int todoNumber) {
		return todoDatabase.findById(todoNumber);
	}
	public void save(Todo newTodo) {
		todoDatabase.save(newTodo);
	}
	public Todo deleteById(int id) {
		return todoDatabase.deletById((long) id);
	}
}
