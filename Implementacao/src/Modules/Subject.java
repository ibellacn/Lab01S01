package Modules;

public class Subject {
	private Integer id;
	private String name;
	private Boolean isOptional;
	
	public Subject(Integer id, String name, Boolean isOptional) {
		this.id = id;
		this.name = name;
		this.isOptional = isOptional;
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

	public Boolean getIsOptional() {
		return isOptional;
	}

	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}
	
}
