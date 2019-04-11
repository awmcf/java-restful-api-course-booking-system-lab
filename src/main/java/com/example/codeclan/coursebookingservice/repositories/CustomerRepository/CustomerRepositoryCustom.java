package com.example.codeclan.coursebookingservice.repositories.CustomerRepository;

import com.example.codeclan.coursebookingservice.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersByCourse(Long id);
}
