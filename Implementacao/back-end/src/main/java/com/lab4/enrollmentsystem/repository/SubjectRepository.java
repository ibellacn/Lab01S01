package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
