package com.example.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
