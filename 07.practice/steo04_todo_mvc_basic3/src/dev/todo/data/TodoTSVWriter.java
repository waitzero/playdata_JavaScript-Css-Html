package dev.todo.data;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;

import dev.todo.model.Todo;

public class TodoTSVWriter {
	
	// 새로운 Todo 등록
	public boolean save(String RESOURCES, Path filePath, Todo newTodo) {
		// todo-data-simple.txt 파일에 todo 데이터 등록하는 코드 작성 예정
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(RESOURCES + "todo-data-simple.txt", true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			long numberOfLines = Files.lines(filePath).count(); // 행이 3개
			int rows = (int) numberOfLines; // 등록하기 전의 현재 데이터의 행 수
			
			rows++; // 새롭게 등록할 데이터의 번호
			bufferedWriter.newLine(); // 한 줄 내려~
			bufferedWriter.write(rows + "\t"); // 할 일 번호 먼저 쓰고, 탭으로 한 칸 띄워
			
			bufferedWriter.write(newTodo.getTitle() + "\t");
			bufferedWriter.write(newTodo.getDueDate() + "\t");
			bufferedWriter.write(newTodo.getDescription());
			
			// 자원 해제(반납)
			bufferedWriter.close();
			outputStreamWriter.close();
			fileOutputStream.close();
			
			// 등록 전의 데이터의 행 수가 등록 후의 행 수보다 더 적을 경우(등록 성공)
			if (numberOfLines < Files.lines(filePath).count()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return false;
	}
}
