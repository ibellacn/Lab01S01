package com.lab4.enrollmentsystem.service;

import com.lab4.enrollmentsystem.model.Semester;
import com.lab4.enrollmentsystem.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SemesterService {
    @Autowired
    private SemesterRepository semesterRepository;

    public List<Semester> listAllSemester(){
        return semesterRepository.findAll();
    }

    public void saveSemester(Semester semester) {
        semesterRepository.save(semester);
    }

    public Semester getSemester(Integer id) {
        return semesterRepository.findById(id).get();
    }

    public void deleteSemester(Integer id) {
        semesterRepository.deleteById(id);
    }
}
