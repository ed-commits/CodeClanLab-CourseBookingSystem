package com.codeclan.example.codeclanbookingsystem.repositories;

import com.codeclan.example.codeclanbookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
