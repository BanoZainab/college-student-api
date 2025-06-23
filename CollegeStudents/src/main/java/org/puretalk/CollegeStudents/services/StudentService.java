package org.puretalk.CollegeStudents.services;

import java.util.List;

import org.puretalk.CollegeStudents.model.Student;

public interface StudentService {
    String createStudent(Student stu);

    Student getStudent(Long id);

    List<Student> readStudents();
}
