package Modules;

import java.util.List;

public class Course {
	private Integer id;
	private String name;
	private Integer credits;
	private String coordinator;
	private Class discipline;
	private List<Class> disciplineList;
	
	public Course(Integer id, String name, Integer credits, String coordinator, Class discipline) {
		this.id = id;
		this.name = name;
		this.credits = credits;
		this.coordinator = coordinator;
		this.discipline = discipline;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}
	
	public Class getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Class discipline) {
		this.discipline = discipline;
	}

	public void addDiscipline() {
		disciplineList.add(discipline);
	}
	
	public void removeDiscipline(int id) {
		if(id == discipline.getId()) {
			disciplineList.remove(discipline);
		}
	}
	
	
}
