package Modules;

import java.util.List;

public class Student extends User {

    private int enrollmentId;
    private List<Class> classes;

    public Student(int id, String name, String email, String password, int enrollmentId, List<Class> classes) {
        super(id, name, email, password);
        this.enrollmentId = enrollmentId;
        this.classes = classes;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}
