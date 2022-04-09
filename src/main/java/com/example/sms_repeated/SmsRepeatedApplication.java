package com.example.sms_repeated;

import com.example.sms_repeated.entity.Student;
import com.example.sms_repeated.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsRepeatedApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsRepeatedApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("john", "DOE", "john@gmail.com");
		studentRepository.save(s1);
		Student s2 = new Student("john2", "DOE2", "john@gmail.com");
		studentRepository.save(s2);
		Student s3 = new Student("john3", "DOE3", "john@gmail.com");
		studentRepository.save(s3);
	}
}
