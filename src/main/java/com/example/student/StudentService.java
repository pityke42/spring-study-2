package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
//This needs to be a SpringBean to provide the dependency injection
@Service
public class StudentService {
  private final StudentRepository studentRepository;
  //Dependency injection
@Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }
}
