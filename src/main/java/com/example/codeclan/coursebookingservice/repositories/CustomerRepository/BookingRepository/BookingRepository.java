package com.example.codeclan.coursebookingservice.repositories.CustomerRepository.BookingRepository;

import com.example.codeclan.coursebookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
