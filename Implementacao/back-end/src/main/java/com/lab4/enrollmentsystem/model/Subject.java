package com.lab4.enrollmentsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    private Integer id;
    private String name;

    @JsonProperty("isOptional")
    private Boolean isOptional;

    public Subject() {
    }

    public Subject(Integer id, String name, Boolean isOptional) {
        this.id = id;
        this.name = name;
        this.isOptional = isOptional;
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

    public Boolean getIsOptional() {
        return isOptional;
    }

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }
}
