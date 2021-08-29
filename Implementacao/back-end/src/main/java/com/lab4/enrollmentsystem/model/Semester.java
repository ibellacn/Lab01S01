package com.lab4.enrollmentsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "SEMESTER")
public class Semester {

    private Integer id;
    private String info;
    private Long credits;

    public Semester() {
    }

    public Semester(Integer id, String info, Long credits) {
        this.id = id;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getCredits() {
        return credits;
    }

    public void setCredits(Long credits) {
        this.credits = credits;
    }

}
