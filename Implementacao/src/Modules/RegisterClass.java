package Modules;

import java.util.List;

public class RegisterClass {
	private List<Student> registeredList;
	private Student student;
	private Class discipline;
	private Double priceDiscipline;
	
	public RegisterClass(Student student, Class discipline, Double priceDiscipline) {
		this.student = student;
		this.discipline = discipline;
		this.priceDiscipline = priceDiscipline;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Class getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Class discipline) {
		this.discipline = discipline;
	}

	public Double getPriceDiscipline() {
		return priceDiscipline;
	}

	public void setPriceDiscipline(Double priceDiscipline) {
		this.priceDiscipline = priceDiscipline;
	}
	
	public void addRegiste() {
		registeredList.add(student);
	}
	
	public void removeRegiste(Integer id) {
		if(id == student.getId()) {
			registeredList.remove(student);
		}
	}
	
	public Double showPrice() {
		return priceDiscipline;
	}
	
}
