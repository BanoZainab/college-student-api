package org.puretalk.CollegeStudents.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    /*
     * Create a Student entity with the following fields:
     * id (Long, auto-generated)
     * name (String)
     * email (String)
     * course (String)
     * year (Integer)
     */

    private Long id;
    private String name;
    private String email;
    private String course;
    private int year;

}
