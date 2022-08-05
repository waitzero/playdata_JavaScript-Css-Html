package dev.todo.view;

import java.time.format.DateTimeFormatter;
import java.util.List;

import dev.todo.model.Todo;

public class TodoView {
   // 출력 역할만 전문적으로 담당할 직원 고용
   // controller에게 전달받은 todo 데이터를 토대로 결과를 깔끔하게 포맷팅해서 정리해주는 역할 
   // view가 할 수 있는 일 : 데이터가 todo든 bank이든 상관없음, 그냥 뭐가 됐든 데이터만 가져다주면 예쁘게 포맷팅해줌
   
   // 1. 전체 조회 결과 출력
   public void findAll(List<Todo> todos) {
      for (Todo todo : todos) {
         System.out.println(String.format("%d 번째로 해야 할 일은 %s 입니다.", todo.getId(), todo.getTitle()));
         System.out.println(todo.getDueDate().format(DateTimeFormatter.ofPattern("기한은 yyyy년 MM월 dd일 까지입니다.")));
         System.out.println(); // 숨 좀 돌리면서 말해요
      }
   }
   
   // 2. 하나의 Todo 조회 결과 출력
   public void findById(Todo todo) {
      System.out.println(todo.getId() + "번째로 할 일은 " + todo.getTitle() + "입니다.");
   }
   
   // 3. 등록 처리 여부 결과 출력 메서드
   public void successPage() {
      System.out.println("정상 등록 되었습니다.");
   }
   
   // 4. 에러 결과 출력
   public void errorPage(Exception error) {
      System.out.println("문제가 발생하였습니다."+ error.getMessage());
   }
   
}