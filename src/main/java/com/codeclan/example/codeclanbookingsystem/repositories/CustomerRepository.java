package com.codeclan.example.codeclanbookingsystem.repositories;

import com.codeclan.example.codeclanbookingsystem.models.Course;
import com.codeclan.example.codeclanbookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Customer findByName(String name);
    List<Customer> findByBookingsCourseName(String name);
    List<Customer> findCustomerByBookingsCourse(Course course);
    List<Customer> findCustomerByTownAndBookingsCourseName(String town, String courseName);
    List<Customer> findCustomerByAgeGreaterThanAndTownAndBookingsCourseName(Integer age, String town, String courseName);

    List<Customer> findByBookingsCourseNameIgnoreCase(String name);
    List<Customer> findCustomerByTownIgnoreCaseAndBookingsCourseNameIgnoreCase(String town, String courseName);
    List<Customer> findCustomerByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseNameIgnoreCase(Integer age, String town, String courseName);
}
