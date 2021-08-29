package com.lab4.enrollmentsystem.service;

import com.lab4.enrollmentsystem.model.Subject;
import com.lab4.enrollmentsystem.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> listAllSubject(){
        return subjectRepository.findAll();
    }

    public void saveSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public Subject getSubject(Integer id) {
        return subjectRepository.findById(id).get();
    }

    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }
}
