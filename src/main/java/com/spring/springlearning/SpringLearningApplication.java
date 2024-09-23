package com.spring.springlearning;

import com.spring.autowireannotaion.Person;
import com.spring.pojo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/springautowireannotation.xml");
		Person student1 = (Person) context.getBean("person");
		System.out.println(student1);

//		ApplicationContext context =new ClassPathXmlApplicationContext("springcongig/springconfig.xml");
//		ApplicationContext context =new ClassPathXmlApplicationContext("config/springannotation.xml");
//		Person person = context.getBean("person", Person.class);
////		person.setAge(123);
//		person.setAddress(new );
//		System.out.println(person);

	}

}
