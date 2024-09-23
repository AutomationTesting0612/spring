package com.spring.springlearning;

import com.spring.qualifier.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLearningQualifierApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/springautowirequalifierannotation.xml");
		Person student1 = (Person) context.getBean("person");
		System.out.println(student1);

	}

}
