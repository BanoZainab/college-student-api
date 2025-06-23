package org.puretalk.CollegeStudents.services;

import java.util.ArrayList;
import java.util.List;

import org.puretalk.CollegeStudents.entity.StudentEntity;
import org.puretalk.CollegeStudents.model.Student;
import org.puretalk.CollegeStudents.repository.StudentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StudentService {

    @Autowired
    private StudentRepo stuRepository;

    // List<Employee> employee = new ArrayList<>();

    @Override
    public String createStudent(Student stu) {
        StudentEntity StudentEntity = new StudentEntity();
        BeanUtils.copyProperties(stu, StudentEntity);
        stuRepository.save(StudentEntity);// save the student entity
        // student.add(stu);
        return "Student added.";
    }

    @Override
    public List<Student> readStudents() {
        List<StudentEntity> stuList = stuRepository.findAll();
        List<Student> student = new ArrayList<>();

        for (StudentEntity stu2 : stuList) {
            Student stu = new Student();
            stu.setId(stu2.getId());
            stu.setName(stu2.getName());
            stu.setEmail(stu2.getEmail());
            stu.setCourse(stu2.getCourse());
            stu.setYear(stu2.getYear());
            student.add(stu);
        }

        return student;
    }

    @Override
    public Student getStudent(Long id) {
        StudentEntity stu = stuRepository.findById(id).get();
        Student student = new Student();
        BeanUtils.copyProperties(stu, student);
        return student;

    }

}
