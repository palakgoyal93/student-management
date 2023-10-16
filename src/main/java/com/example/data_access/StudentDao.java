package com.example.data_access;

import com.example.models.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    Student delete(int id);
}
