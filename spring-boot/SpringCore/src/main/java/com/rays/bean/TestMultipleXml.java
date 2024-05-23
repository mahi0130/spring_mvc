package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		UserBean bean = (UserBean)context.getBean("user");
		System.out.println(bean.getName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		
		PersonBean bean2 = (PersonBean)context.getBean("person");
		System.out.println(bean2.getAddress());
	}

}
