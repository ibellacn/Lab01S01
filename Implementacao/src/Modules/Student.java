package Modules;

import java.util.List;

public class Student extends User {
	
    private List<RegisterClass> registeredList;

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void enrollment(RegisterClass register) {
    	registeredList.add(register);
    }

    public void cancelEnrollmentId(RegisterClass register) {
    	registeredList.remove(register);
    }
}
