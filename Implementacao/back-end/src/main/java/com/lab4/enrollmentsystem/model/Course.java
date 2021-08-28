package com.lab4.enrollmentsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "COURSE")
public class Course {

    private Integer id;
    private String name;
    private Long credits;

    public Course() {
    }

    public Course(Integer id, String name, Long credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
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

    public Long getCredits() {
        return credits;
    }

    public void setCredits(Long credits) {
        this.credits = credits;
    }

}
