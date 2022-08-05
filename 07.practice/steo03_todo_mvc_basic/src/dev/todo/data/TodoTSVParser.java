package dev.todo.data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import dev.todo.model.Todo;
public class TodoTSVParser {
    // 한줄만 파싱하는 메서드
    private Todo parseFromTSV(final String line) {
        String[] columns = line.split("\t");
        int id = Integer.parseInt(columns[0]);
        String title = columns[1];
        LocalDate dueDate = LocalDate.parse(columns[2]);
        String description = columns[3];
//      Todo todo = new Todo(id, title, dueDate, description);
//      return todo;
        return new Todo(id, title, dueDate, description);
    }
    // 파싱된 한 줄의 데이터를 배열에 추가
    public List<Todo> parseLinesFromTSV(List<String> lines, int rows) {
        List <Todo> todos = new ArrayList<>();
        int index = 0;
        for (String line : lines) {
        	Todo todo = parseFromTSV(line);
        	todos.add(todo);
        	
        }
        return todos;
    }
}
