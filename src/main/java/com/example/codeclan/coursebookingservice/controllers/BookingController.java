package com.example.codeclan.coursebookingservice.controllers;

import com.example.codeclan.coursebookingservice.models.Booking;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingsByDate(@PathVariable String date) {
        return bookingRepository.findBookingsByDate(date);
    }

}
