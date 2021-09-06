package com.lab4.enrollmentsystem.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PROFESSOR")
@PrimaryKeyJoinColumn(name="USER_ID")
public class Professor extends User{
    private String cpf;
    private String info;

    public Professor() {
    }

    public Professor(String cpf, String info) {
        this.cpf = cpf;
        this.info = info;
    }

    public Professor(Integer id, String name, String email, String password, String type, String cpf, String info) {
        super(id, name, email, password, type);
        this.cpf = cpf;
        this.info = info;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
