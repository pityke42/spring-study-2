package com.example.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//RestController annotation makes this class serve Rest endpoints
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
  private final StudentService studentService;
  //Dependency injection
  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }
  //Restful endpoint annotation
  @GetMapping
  public List<Student> getAllStudent(){
  return studentService.getAllStudent();
  }
 @PostMapping
  public void registerNewStudent(@RequestBody Student student){
    studentService.addNewStudent(student);}

}
