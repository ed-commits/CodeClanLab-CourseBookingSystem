package com.codeclan.example.codeclanbookingsystem.repositories;

import com.codeclan.example.codeclanbookingsystem.models.Course;
import com.codeclan.example.codeclanbookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByName(String name);
    Course findByNameIgnoreCase(String name);
    List<Course> findByRating(Integer rating);
    List<Course> findByBookingsCustomer(Customer customer);
    List<Course> findByBookingsCustomerNameIgnoreCase(String customerName);
}
