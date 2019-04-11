package com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CourseRepository;

import com.example.codeclan.coursebookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCoursesByRating(int rating);

}