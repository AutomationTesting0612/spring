package com.spring.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(111,"Ram", "Btech"));
        list.add(new Student(2,"Akhil", "Btech"));
        list.add(new Student(31,"Suryansh", "Btech"));
        list.add(new Student(4,"Sarthak", "Btech"));
        list.add(new Student(52,"Shivam", "Btech"));

        Collections.sort(list);

        for(Student s:list) {

            System.out.println(s);
        }

    }
}
