package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBeanAnnotation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle2.xml");
		MyBeanAnnotation an = (MyBeanAnnotation) context.getBean("mybeanannotation");
		((ClassPathXmlApplicationContext) context).close();

	}

}
