package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester, Integer> {
}
