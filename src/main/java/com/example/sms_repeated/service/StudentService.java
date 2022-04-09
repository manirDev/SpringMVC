package com.example.sms_repeated.service;

import com.example.sms_repeated.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
