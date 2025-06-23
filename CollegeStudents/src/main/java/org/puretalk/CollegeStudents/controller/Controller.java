package org.puretalk.CollegeStudents.controller;

import java.util.List;

import org.puretalk.CollegeStudents.model.Student;
import org.puretalk.CollegeStudents.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

@RestController
public class Controller {

    // EmpService empser = new EmployServiceImpl();
    // Dependency Injection
    @Autowired
    StudentService stuser;

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return stuser.readStudents();
    }

    @GetMapping("students/{id}")
    public Student getStudent(@PathVariable Long id) {
        return stuser.getStudent(id);
    }

    @PostMapping("students")
    public String createStudent(@Valid @RequestBody Student stu) {
        return stuser.createStudent(stu);
    }

}
