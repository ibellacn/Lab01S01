package com.lab4.enrollmentsystem.controller;

import com.lab4.enrollmentsystem.model.Semester;
import com.lab4.enrollmentsystem.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/semester")
public class SemesterController {
    @Autowired
    SemesterService semesterService;

    @GetMapping("")
    public List<Semester> list() {
        return semesterService.listAllSemester();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Semester> get(@PathVariable Integer id) {
        try {
            Semester semester = semesterService.getSemester(id);
            return new ResponseEntity<Semester>(semester, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Semester>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Semester semester) {
        semesterService.saveSemester(semester);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Semester semester, @PathVariable Integer id) {
        try {
            Semester existSemester = semesterService.getSemester(id);
            semester.setId(id);
            semesterService.saveSemester(semester);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        semesterService.deleteSemester(id);
    }
}
