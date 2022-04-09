package com.example.sms_repeated.repository;

import com.example.sms_repeated.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLType;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
