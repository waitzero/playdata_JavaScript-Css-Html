package dev.todo.model;

import java.time.LocalDate;

public class Todo {
	private int id; // 할 일 번호
	private String title; // 할 일 제목
	private LocalDate dueDate; // 할 일 마감기한
	private String description; // 할 일 내용
	private boolean isCompleted = false; // 진행 여부
	private Object localDate;;

	public Todo(int id, String title, String description, LocalDate localDate) {
		this.id = id;
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}

	public Todo(String title, LocalDate dueDate, String description) {
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}

	public Todo(String title, String description, LocalDate of) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.description=description;
		this.localDate= of;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", dueDate=" + dueDate + ", description=" + description + "]";
	}

}
