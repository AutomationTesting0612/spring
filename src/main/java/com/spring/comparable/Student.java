package com.spring.comparable;

import java.util.Comparator;

public class Student implements Comparable<Student>{

    private int rollNo;

    private String name;

    private String course;


    public Student(int r, String n, String c){
        this.rollNo=r;
        this.name=n;
        this.course=c;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {

        if (rollNo > s.rollNo) {
            return 1;
        } else if (rollNo==s.rollNo){
            return 0;
        }
        return -1;
    }

}
