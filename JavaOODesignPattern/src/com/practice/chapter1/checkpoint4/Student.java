package com.practice.chapter1.checkpoint4;

import java.util.List;

public class Student {
    List<Course> courseList;

    public void registerCourse(Course course) {
        courseList.add(course);
    }

    public void dropCourse(Course course) {
        courseList.remove(course);
    }
}
