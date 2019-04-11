package com.example.codeclan.coursebookingservice.controllers;

import com.example.codeclan.coursebookingservice.models.Course;
import com.example.codeclan.coursebookingservice.models.Customer;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CourseRepository.CourseRepository;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> coursesByRating(@PathVariable int rating) {
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/{id}/customers")
    public List<Customer> customersByCourse(@PathVariable Long id) {
        return customerRepository.findCustomersByCourse(id);
    }

}