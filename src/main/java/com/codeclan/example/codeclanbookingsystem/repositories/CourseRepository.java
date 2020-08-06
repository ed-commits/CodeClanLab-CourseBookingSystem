package com.codeclan.example.codeclanbookingsystem.repositories;

import com.codeclan.example.codeclanbookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
