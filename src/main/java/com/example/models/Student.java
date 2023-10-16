package com.example.models;

public class Student {
    private int id;
    private String name;
    private static int nextStudentID = 1;

    public Student() {

    }

    // Methods

    private int generateUniqueID() {
        int uniqueID = nextStudentID;
        nextStudentID++;
        return uniqueID;
    }

    public Student(String name) {
        this.id = generateUniqueID();
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        if (id >= nextStudentID) {
            nextStudentID = id + 1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        if (id >= nextStudentID) {
            nextStudentID = id + 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
