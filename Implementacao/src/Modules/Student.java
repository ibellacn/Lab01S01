package Modules;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	
	private List<Student> listStudent = new ArrayList<>();
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String email, String password) {
		super(id, name, email, password);
	}
	public void addStudent(Student student) {
		listStudent.add(student);
	}
	
	public void removeStudent(Student student) {
		listStudent.remove(student);
	}
}
