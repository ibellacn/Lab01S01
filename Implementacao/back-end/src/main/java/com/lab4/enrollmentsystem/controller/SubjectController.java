package com.lab4.enrollmentsystem.controller;

import com.lab4.enrollmentsystem.model.Subject;
import com.lab4.enrollmentsystem.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("")
    public List<Subject> list() {
        return subjectService.listAllSubject();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> get(@PathVariable Integer id) {
        try {
            Subject subject = subjectService.getSubject(id);
            return new ResponseEntity<Subject>(subject, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Subject>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Subject subject, @PathVariable Integer id) {
        try {
            Subject existSubject = subjectService.getSubject(id);
            subject.setId(id);
            subjectService.saveSubject(subject);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        subjectService.deleteSubject(id);
    }
}
