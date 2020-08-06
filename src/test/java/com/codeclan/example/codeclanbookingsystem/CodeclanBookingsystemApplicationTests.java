package com.codeclan.example.codeclanbookingsystem;

import com.codeclan.example.codeclanbookingsystem.models.Course;
import com.codeclan.example.codeclanbookingsystem.repositories.BookingRepository;
import com.codeclan.example.codeclanbookingsystem.repositories.CourseRepository;
import com.codeclan.example.codeclanbookingsystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CodeclanBookingsystemApplicationTests {

  @Autowired
  CourseRepository courseRepository;

  @Autowired
  BookingRepository bookingRepository;

  @Autowired
  CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetByRating() {
		List<Course> found = courseRepository.findByRating(3);
		assertEquals(2, found.size());
	}

}
