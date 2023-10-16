package com.example.service;

import com.example.data_access.StudentDao;
import com.example.models.Student;
import com.example.utils.UserInputService;

import java.util.List;

public class StudentManagementConsoleImpl {
    @Autowired
    private UserInputService scannerService;

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student create() {
        return new Student();
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
        Student student = this.find(id);
        Student deletedStudent = studentDao.delete(id);

        if (deletedStudent != null) {
            return deletedStudent;
        } else {
            return null;
        }
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        studentDao.delete(student.getId());
        studentDao.save(student);
        return student;
    }
}
