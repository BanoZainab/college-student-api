package org.puretalk.CollegeStudents.repository;

import org.puretalk.CollegeStudents.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
