package com.lab4.enrollmentsystem.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
@PrimaryKeyJoinColumn(name="USER_ID")
public class Student extends User{
    private String cpf;

    public Student() {
    }

    public Student(Integer id, String name, String email, String password, String type, String cpf) {
        super(id, name, email, password, type);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
