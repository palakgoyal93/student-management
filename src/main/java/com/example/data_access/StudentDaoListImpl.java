package com.example.data_access;

import com.example.data_access.Component;
import com.example.models.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao
{
   private List<Student> students;
    public StudentDaoListImpl() {
        System.out.println("Student list initialized and ready to use ...");
        this.students = new ArrayList<>();
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return students.stream()
                .filter(student -> student.getId()==id)
                .findFirst().orElse(null);
    }



    @Override
    public List<Student> findAll() {
        return students;
    }
    @Override
    public void delete(int id) {
        students.remove(find(id));

    }
}
