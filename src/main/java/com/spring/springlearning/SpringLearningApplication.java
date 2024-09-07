package com.spring.springlearning;

import com.spring.nonprimitive.Person;
import com.spring.pojo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLearningApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("config/config.xml");
//		Student student1 = (Student) context.getBean("Student");
//		System.out.println(student1);

		ApplicationContext context =new ClassPathXmlApplicationContext("springcongig/springconfig.xml");
		Person person = (Person) context.getBean("Person");
		System.out.println(person);

	}

}
