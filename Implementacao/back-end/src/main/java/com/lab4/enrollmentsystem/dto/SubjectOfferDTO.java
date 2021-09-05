package com.lab4.enrollmentsystem.dto;

import java.util.List;

public class SubjectOfferDTO {
    private Integer id;
    private String scheduleCron;
    private String status;
    private Integer subjectId;
    private String professorCpf;
    private Integer semesterId;
    private List<String> studentsCpf;

    public SubjectOfferDTO() {
    }

    public SubjectOfferDTO(Integer id, String scheduleCron, String status, Integer subjectId, String professorCpf, Integer semesterId, List<String> studentsCpf) {
        this.id = id;
        this.scheduleCron = scheduleCron;
        this.status = status;
        this.subjectId = subjectId;
        this.professorCpf = professorCpf;
        this.semesterId = semesterId;
        this.studentsCpf = studentsCpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScheduleCron() {
        return scheduleCron;
    }

    public void setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getProfessorCpf() {
        return professorCpf;
    }

    public void setProfessorCpf(String professorCpf) {
        this.professorCpf = professorCpf;
    }

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public List<String> getStudentsId() {
        return studentsCpf;
    }

    public void setStudentsId(List<String> studentsId) {
        this.studentsCpf = studentsId;
    }
}
