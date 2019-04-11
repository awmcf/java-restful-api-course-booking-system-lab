package com.example.codeclan.coursebookingservice.components;

import com.example.codeclan.coursebookingservice.models.Booking;
import com.example.codeclan.coursebookingservice.models.Course;
import com.example.codeclan.coursebookingservice.models.Customer;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.BookingRepository.BookingRepository;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CourseRepository.CourseRepository;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("John Smith", "Northampton", 45);
        customerRepository.save(customer1);

        Course course1 = new Course("Python", "Edinburgh", 5);
        courseRepository.save(course1);

        Booking booking1= new Booking("25-12-2019", customer1, course1);
        bookingRepository.save(booking1);

        customer1.addBooking(booking1);

        course1.addBooking(booking1);

        Customer customer2 = new Customer("Alex Shing", "Edinburgh", 28);
        customerRepository.save(customer2);

        Booking booking2= new Booking("25-12-2019", customer2, course1);
        bookingRepository.save(booking2);
    }

}
