package Modules;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
	private String responsability;
	private String degree;
	private List<Teacher> listTeacher = new ArrayList<>();
	
	public Teacher() {
        super();
    }

	public Teacher(int id, String name, String email, String password) {
        super(id, name, email, password);
    }
	
    public Teacher(int id, String name, String email, String password, String responsability, String degree) {
        super(id, name, email, password);
        this.responsability = responsability;
        this.degree = degree;
    }


	public String getResponsability() {
		return responsability;
	}


	public void setResponsability(String responsability) {
		this.responsability = responsability;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}
    
	public void addTeacher(Teacher teacher) {
		listTeacher.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher) {
		listTeacher.remove(teacher);
	}

}
