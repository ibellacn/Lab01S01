package com.lab4.enrollmentsystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SEMESTER")
public class Semester{

    private Integer id;
    private String info;
    private Date enrollmentStartDate;
    private Date enrollmentEndDate;

    public Semester() {

    }

    public Semester(Integer id, String info, Date enrollmentStartDate, Date enrollmentEndDate) {
        this.id = id;
        this.info = info;
        this.enrollmentStartDate = enrollmentStartDate;
        this.enrollmentEndDate = enrollmentEndDate;
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

    public Date getEnrollmentStartDate() {
        return enrollmentStartDate;
    }

    public void setEnrollmentStartDate(Date enrollmentStartDate) {
        this.enrollmentStartDate = enrollmentStartDate;
    }

    public Date getEnrollmentEndDate() {
        return enrollmentEndDate;
    }

    public void setEnrollmentEndDate(Date enrollmentEndDate) {
        this.enrollmentEndDate = enrollmentEndDate;
    }
}
