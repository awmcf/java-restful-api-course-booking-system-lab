package com.example.codeclan.coursebookingservice.repositories.CustomerRepository;

import com.example.codeclan.coursebookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

}
