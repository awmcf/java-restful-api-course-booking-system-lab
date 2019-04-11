package com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CourseRepository;

import com.example.codeclan.coursebookingservice.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findCoursesByCustomerId(Long id);
}
