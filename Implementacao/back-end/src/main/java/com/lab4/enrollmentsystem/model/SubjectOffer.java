package com.lab4.enrollmentsystem.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SUBJECT_OFFER")
public class SubjectOffer {
    private Integer id;
    private String scheduleCron;

    @Enumerated(javax.persistence.EnumType.STRING)
    @Type(type = "com.lab4.enrollmentsystem.model.EnumSystemType")
    private String status;

    private Subject subject;
    private Professor professor;
    private Semester semester;
    private List<Student> students;

    public SubjectOffer() {
    }

    public SubjectOffer(Integer id, String scheduleCron, String status, Subject subject, Professor professor, Semester semester) {
        this.id = id;
        this.scheduleCron = scheduleCron;
        this.status = status;
        this.subject = subject;
        this.professor = professor;
        this.semester = semester;
        this.students = new ArrayList<>();
    }

    public SubjectOffer(Integer id, String scheduleCron, String status, Integer subjectId, String professorCpf, Integer semesterId) {
        this.id = id;
        this.scheduleCron = scheduleCron;
        this.status = status;
        this.subject.setId(subjectId);
        this.professor.setCpf(professorCpf);
        this.semester.setId(semesterId);
        this.students = new ArrayList<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID", nullable = false)
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @ManyToOne
    @JoinColumn(name = "PROFESSOR_CPF", nullable = false)
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @ManyToOne
    @JoinColumn(name = "SEMESTER_ID", nullable = false)
    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @ManyToMany
    @JoinTable(name="ENROLLMENT", joinColumns=
            {@JoinColumn(name="SUBJECT_OFFER_ID")}, inverseJoinColumns=
            {@JoinColumn(name="STUDENT_CPF")})
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
