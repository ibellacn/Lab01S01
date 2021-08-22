package Modules;

import java.util.List;

public class Professor extends User{
    private List<Class> classes;
    private Float salary;

    public Professor(int id, String name, String email, String password, List<Class> classes, Float salary) {
        super(id, name, email, password);
        this.classes = classes;
        this.salary = salary;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
