package com.lab4.enrollmentsystem.service;

import com.lab4.enrollmentsystem.model.Course;
import com.lab4.enrollmentsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> listAllCourse(){
        return courseRepository.findAll();
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public Course getCourse(Integer id) {
        return courseRepository.findById(id).get();
    }

    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }
}
