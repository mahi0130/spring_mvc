package com.rays.autowireByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.autowireByName.UserService;

public class TestAutowireByType {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-type.xml");
		UserService userService = (UserService)  context.getBean("userService");
		userService.testAdd();
		
		
		
		}

}