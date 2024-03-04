package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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
  public void addNewStudent(Student student){
  Optional<Student>studentByEmail = studentRepository
          .findStudentByEmail(student.getEmail());
    System.out.println(student);
    if(studentByEmail.isPresent()){
      throw new IllegalStateException("email is taken");
    }
  studentRepository.save(student);
  }
}
