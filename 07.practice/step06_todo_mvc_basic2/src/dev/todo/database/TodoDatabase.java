package dev.todo.database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.todo.model.Todo;

public class TodoDatabase {
	//프로그램 실행 시 간이DB가 세팅될 때 사용할 필드(todoDatebase 필드 내에 todo 데이터들이 있음)
	private static List<Todo> todoData = new ArrayList<>();//이 코드는 공간만 할당한 상태
	private static TodoDatabase todoDatabase = new TodoDatabase();
	{//static block, {}내부에 있는 코드가 한번만 실행됨		
		todoData.add(new Todo(1, "숙제하기", "수학, 영어 숙제", LocalDate.of(2022, 4, 5)));
		todoData.add(new Todo(2, "조깅하기", "공원에서 1시간 동안 조깅을 한다.", LocalDate.of(2022, 5, 7)));
        todoData.add(new Todo(3, "빨래하기", "빨래를 모아서 세탁기를 돌린다.", LocalDate.of(2022, 4, 4)));
        todoData.add(new Todo(4, "피아노", "학원에서 피아노를 연습한다", LocalDate.of(2022, 4, 7)));
        todoData.add(new Todo(5, "강아지 밥주기", "강아지에게 사료를 준다.", LocalDate.of(2022, 4, 7)));
	}
	//privarte 제어자를 통해 외부 클래스에서 TodoDatabase(자신)인스턴스의 생성을 제한
	private TodoDatabase(){}
	
	public static List<Todo> getTododata() {
		// TODO Auto-generated method stub
		return todoData;
	}
	//인스턴스의 생성은 자신만 가능, 별도의 메서드를 통해 생성 인스턴스 반환
	public static TodoDatabase getInstance(){
		return todoDatabase;
	}
	public Todo findById(int todoNumber) {
		//DB상에서 내부적으로id값에 의해 해당되는 데이터를 찾는 처리를 java코드로 표현하는것
		//->sql:
		for(Todo todo:todoData) {
			if(todo.getId()==todoNumber) {
				return todo;
			}
		}return null;
		
	}
	public boolean save(Todo newTodo) {
		int nextIndex = todoData.size() +1;
		newTodo.setId(nextIndex);
		if(todoData.add(newTodo)) return true;
		return false;
	}
	
	public Todo deletById(Long id) {
		for (Todo todo:todoData) {
			if(todo.getId()==id) {
				return todoDatabase.remove(id.intValue());
			}
		}
		return null;
}

	private Todo removeall() {
		return todoDatabase.remove();
	}
}
