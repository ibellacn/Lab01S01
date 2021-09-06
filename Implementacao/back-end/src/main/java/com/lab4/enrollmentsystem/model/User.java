package com.lab4.enrollmentsystem.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "USER")
//@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;

    @Enumerated(javax.persistence.EnumType.STRING)
    @Type(type = "com.lab4.enrollmentsystem.model.EnumSystemType")
    private String type;

    public User() {
    }

    public User(Integer id, String name, String email, String password, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
