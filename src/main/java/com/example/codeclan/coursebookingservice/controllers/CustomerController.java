package com.example.codeclan.coursebookingservice.controllers;

import com.example.codeclan.coursebookingservice.models.Course;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CourseRepository.CourseRepository;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/{id}/courses")
    public List<Course> findCoursesByCustomerId(@PathVariable Long id) {
        return courseRepository.findCoursesByCustomerId(id);
    }

}
