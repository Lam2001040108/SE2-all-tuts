package com.example.tutorial05.repository;

import com.example.tutorial05.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
