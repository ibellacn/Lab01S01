package com.lab4.enrollmentsystem.service;

import com.lab4.enrollmentsystem.dto.SubjectOfferDTO;
import com.lab4.enrollmentsystem.model.*;
import com.lab4.enrollmentsystem.repository.ProfessorRepository;
import com.lab4.enrollmentsystem.repository.SemesterRepository;
import com.lab4.enrollmentsystem.repository.SubjectOfferRepository;
import com.lab4.enrollmentsystem.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectOfferRepository subjectOfferRepository;

    @Autowired
    private SemesterRepository semesterRepository;

    @Autowired
    private ProfessorRepository professorRepository;

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

    public List<SubjectOffer> listAllSubjectOffer(Integer subjectId) {
        return subjectOfferRepository.findAllById(Collections.singleton(subjectId));
    }

    public SubjectOffer getSubjectOffer(Integer offerId) {
        return subjectOfferRepository.getById(offerId);
    }

    public void saveSubjectOffer(SubjectOfferDTO subjectOfferDTO) {
        Semester semester = semesterRepository.findById(subjectOfferDTO.getSemesterId()).get();
        Subject subject = getSubject(subjectOfferDTO.getSubjectId());

        Professor professor = null;
        List<Object> response = professorRepository.findByCpf(subjectOfferDTO.getProfessorCpf());
        Iterator itr = response.iterator();
        while(itr.hasNext()){
            Object[] obj = (Object[]) itr.next();
            professor = new Professor(String.valueOf(obj[0]), String.valueOf(obj[1]));
        }

        SubjectOffer subjectOffer = new SubjectOffer(subjectOfferDTO.getId(), subjectOfferDTO.getScheduleCron(),
                subjectOfferDTO.getStatus(), subject, professor, semester);
        subjectOfferRepository.save(subjectOffer);
    }

    public void deleteSubjectOffer(Integer offerId) {
        subjectOfferRepository.deleteById(offerId);
    }
}
