package com.spring.removexml;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StudentMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Student.class);

       Student st= context.getBean(Student.class);

        System.out.println(st);

    }

}
