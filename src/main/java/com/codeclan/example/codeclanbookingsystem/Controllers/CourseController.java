package com.codeclan.example.codeclanbookingsystem.Controllers;

import com.codeclan.example.codeclanbookingsystem.models.Course;
import com.codeclan.example.codeclanbookingsystem.models.Customer;
import com.codeclan.example.codeclanbookingsystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity getAllCoursesByRatingAndForCustomer(
            @RequestParam(required = false, name = "rate") Integer rate,
            @RequestParam(required = false, name = "customerName") String customerName
    ) {
        if(rate != null) {
            return new ResponseEntity<>(courseRepository.findByRating(rate), HttpStatus.OK);
        }
        if(customerName != null) {
            return new ResponseEntity<>(courseRepository.findByBookingsCustomerName(customerName), HttpStatus.OK);
        }
        return  new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
}