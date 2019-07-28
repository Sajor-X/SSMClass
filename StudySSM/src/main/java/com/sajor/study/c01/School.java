package com.sajor.study.c01;

import java.util.ArrayList;
import java.util.List;

public class School {
    private int id = 2000;
    private String name = "Sajor";
    private Student student;
    private List<Student> students = new ArrayList();

    public School(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
