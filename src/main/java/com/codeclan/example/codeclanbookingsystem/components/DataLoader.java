package com.codeclan.example.codeclanbookingsystem.components;

import com.codeclan.example.codeclanbookingsystem.models.Booking;
import com.codeclan.example.codeclanbookingsystem.models.Course;
import com.codeclan.example.codeclanbookingsystem.models.Customer;
import com.codeclan.example.codeclanbookingsystem.repositories.BookingRepository;
import com.codeclan.example.codeclanbookingsystem.repositories.CourseRepository;
import com.codeclan.example.codeclanbookingsystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public void run(ApplicationArguments args) {
        courseRepository.save(new Course("Software Development", "Edinburgh", 1));
        courseRepository.save(new Course("Data Science", "Edinburgh", 2));
        courseRepository.save(new Course("Web Development", "Edinburgh", 3));

        courseRepository.save(new Course("Data Structure", "Glasgow", 3));
        courseRepository.save(new Course("Algorithms", "Glasgow", 4));
        courseRepository.save(new Course("FrontEnd", "Glasgow", 5));

        customerRepository.save(new Customer("Harrison", "Edinburgh", 30));
        customerRepository.save(new Customer("Alex", "Edinburgh", 32));
        customerRepository.save(new Customer("John", "Edinburgh", 33));

        customerRepository.save(new Customer("Paul", "Glasgow", 20));
        customerRepository.save(new Customer("Jon", "Glasgow", 22));
        customerRepository.save(new Customer("George", "Glasgow", 23));

        bookingRepository.save(new Booking("2020-09-01", customerRepository.findByName("Harrison"), courseRepository.findByName("Software Development")));
    }
}
