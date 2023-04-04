package com.mock_learning_code.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive();
		Tire tir = (Tire) context.getBean("tire");
		System.out.println(tir.toString());
	}

}
