package Modules;

import java.util.List;

public class Teacher extends User {
	private String responsability;
	private String degree;
	

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
    
	public void getAllClass() {
		
	}
	
	public void getClassDetails(Integer idClass, String nameClass) {
		
	}

}
