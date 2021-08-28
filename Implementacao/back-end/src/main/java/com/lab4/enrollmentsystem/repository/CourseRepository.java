package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
