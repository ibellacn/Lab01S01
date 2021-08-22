package Modules;

import java.util.List;

public class Class {
	private Integer id;
	private String name;
	private Integer workload;
	private Teacher teacher;
	private String description;
	private String bibliography;
	private String menu;
	private Boolean isOptional;
	private Integer registerdStudent;
	private List<RegisterClass> registerListInDiscipline;
	
	
	public Class(Integer id, String name, Integer workload, Teacher teacher, String description,
			String bibliography, String menu, Boolean isOptional, Integer registerdStudent) {
		this.id = id;
		this.name = name;
		this.workload = workload;
		this.teacher = teacher;
		this.description = description;
		this.bibliography = bibliography;
		this.menu = menu;
		this.isOptional = isOptional;
		this.registerdStudent = registerdStudent;
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
	
	public Integer getWorkload() {
		return workload;
	}
	
	public void setWorkload(Integer workload) {
		this.workload = workload;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getBibliography() {
		return bibliography;
	}
	
	public void setBibliography(String bibliography) {
		this.bibliography = bibliography;
	}
	
	public String getMenu() {
		return menu;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public Boolean getIsOptional() {
		return isOptional;
	}
	
	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}
	
	public Integer getRegisterdStudent() {
		return registerdStudent;
	}
	
	public Integer disciplineRegister() {
		return registerdStudent = registerListInDiscipline.size();
	}
	
	public Boolean isActiveDiscipline() {
		if(registerdStudent >= 3) {
			return true;
		}
		return false;
	}
}
