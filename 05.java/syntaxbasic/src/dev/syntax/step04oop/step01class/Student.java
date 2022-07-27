package dev.syntax.step04oop.step01class;

public class Student {
	String Id;
	String name;
	int korScore;
	int engScore;

	public Student() {
		System.out.println("Student()»£√‚");
	}
	public Student(String Id, String name, int korScore, int engScore) {
		this.Id= Id;
		this.name = name;
		this.korScore=korScore;
		this.engScore=engScore;
		
	}
}