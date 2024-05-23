package com.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Child.xml");
		TestBean bean = (TestBean) context.getBean("drivedTestBean");
		System.out.println(bean.toString());
	}

}
