package com.example.codeclan.coursebookingservice.components;

import com.example.codeclan.coursebookingservice.models.Customer;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("John Smith", "Northampton", 45);
        customerRepository.save(customer1);
    }

}
