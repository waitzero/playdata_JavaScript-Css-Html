package dev.todo.controller;

import java.util.List;

import dev.todo.model.Todo;
import dev.todo.service.TodoService;
import dev.todo.view.TodoView;

public class TodoController {
   
   /*
    * controller가 어떤 액션(전체 조회 or id로 조회 등)을 취할지 결정
    * -> Controller 클래스에서 findAll() 호출
    * -> findById()
    */
   // 멤버 필드 중 인스턴스 변수(전역 변수)

   private final TodoView todoView = new TodoView();
   private final TodoService todoService = new TodoService();
   private Exception errorObject;
   
   public TodoController() {
      
   }
   
   public void findAll() {
      List<Todo> todos = todoService.findAll();
      todoView.findAll(todos);
   }

   public void findById(int todoNumber) {
     Todo todo = todoService.findById(todoNumber);
     todoView.findById(todo);
   }
   
   
   public void save(Todo newTodo) {
	  boolean result =  todoService.save(newTodo);
	   if(result) {
		   todoView.successPage();
	   }else {
		   Exception errorObject = new Exception("Database Insert 실패");
		   todoView.errorPage(errorObject);
	   }
	   
		   
	   }

   public void deleteById(int id) {
	   boolean result = todoService.deleteById(id);
	   if(result) {
		   todoView.successPage();
	   }else {
		   Exception errorObject = new Exception("Database Remove 실패");
		   todoView.errorPage(errorObject);
   }


   }
 
}
   
   


