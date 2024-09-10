package com.app.studentmanagement.service;

import com.app.studentmanagement.model.Student;

import java.util.Optional;

public interface StudentService {

    Student createStudent(Student student);

    Optional<Student> getStudentById(String id);

    Student updateStudent(String id, Student student);

    void deleteStudent(String id);

}