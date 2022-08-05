package dev.todo.service;

import java.util.List;

import dev.todo.dao.TodoDAO;
import dev.todo.model.Todo;

public class TodoService {
	// 비즈니스 로직과 관련된 코드를 모아두는 부분
	//ser	vice의 역할:
	//service 클래스가 db에 직접적으로 접근하지 않고, db에 접근하는 역할을 담당하는 클래스를 별도로 하나 더 만들어서 한 층 더 추상화
	//db에 접근하는 코드 예시.result set.getstring()...connection등 여러 객체들이 필요
	//db에 접근하는 역할(별도의 클래스), Data Access
	
	
	private final TodoDAO todoDAO;
	
	public TodoService() {
		todoDAO = new TodoDAO();
	}
	
	// 1. 조회 기능: 전체 Todos 조회 메서드
	public List<Todo> findAll() {
		
		return todoDAO.findAll();
	}
	
	// 2. 조회기능2 : 할 일 순서 번호로 하나의 Todo 조회 메서드
	public Todo findById(int todoNumber) {
		todoDAO.findById(todoNumber);
		return null;
	}
	
	// 3. 등록 기능
	public boolean save(Todo newTodo) {
		return false;
	}
	
	public boolean deleteById(int id) {
		todoDAO.deleteById(id);
	return false;
	}
}
