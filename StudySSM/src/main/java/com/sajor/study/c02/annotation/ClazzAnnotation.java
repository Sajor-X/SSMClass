package com.sajor.study.c02.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("clazzAnnotation")
public class ClazzAnnotation {
    private int id = 2015001;
    private String name = "2015001 班";
    private TeacherAnnotation teacherAnnotation;//班主任

    @Autowired
    public ClazzAnnotation(TeacherAnnotation teacherAnnotation) {
        this.teacherAnnotation = teacherAnnotation;
    }

    public TeacherAnnotation getTeacherAnnotation() {
        return teacherAnnotation;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("基于注解注入:");
        stringBuffer.append("\n");
        stringBuffer.append("id=");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        stringBuffer.append("\n");
        stringBuffer.append("班主任:");
        stringBuffer.append(this.getTeacherAnnotation().getId());
        stringBuffer.append(" ");
        stringBuffer.append(this.getTeacherAnnotation().getName());
        return stringBuffer.toString();
    }
}
