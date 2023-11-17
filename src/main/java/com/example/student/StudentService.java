package com.example.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//This needs to be a SpringBean to provide the dependency injection
@Service
public class StudentService {
  public List<Student> getAllStudent() {
    return List.of(
            new Student(
                    1L,
                    "Rebeka",
                    "rebeka.nevegyelkokotinkabbkepet@gmail.com",
                    LocalDate.of(1995, 2, 8),
                    28

            )
    );
  }
}
