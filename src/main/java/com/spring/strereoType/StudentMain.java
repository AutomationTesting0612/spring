package com.spring.strereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config/stereoType.xml");

       Student st= context.getBean("student", Student.class);

        System.out.println(st);

    }

}
