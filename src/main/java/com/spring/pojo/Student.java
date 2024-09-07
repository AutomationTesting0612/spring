package com.spring.pojo;


import java.util.List;

//Pojo---> Plain Old Java Object
public class Student {

    private String name;

    private int age;

    private int id;

    private List<String> num;

    public List<String> getNum() {
        return num;
    }

    public void setNum(List<String> num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", num=" + num +
                '}';
    }
}
