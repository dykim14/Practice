package com.practice.chapter1;

public class Course {
    private String id;
    private String name;
    private Integer numOfStudents = 0;

    public void addStudent() {
        numOfStudents++;
    }

    public void deleteStudent() {
        numOfStudents--;
    }
}
