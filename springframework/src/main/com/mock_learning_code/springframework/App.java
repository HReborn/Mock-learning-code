package com.mock_learning_code.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mock_learning_code.springframework.fullannotationbased.AppConfig;
import com.mock_learning_code.springframework.fullannotationbased.Samsung;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Vehicle obj = (Vehicle)
		 * context.getBean("car"); obj.drive();
		 */
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		System.out.println(s7.getConfigs());
	}
}
