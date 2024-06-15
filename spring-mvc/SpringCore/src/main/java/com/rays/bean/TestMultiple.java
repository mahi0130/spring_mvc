package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"UserBean.xml" , "PersonBean.xml"});
		 UserBean bean = (UserBean)context.getBean("user");
		 System.out.println(bean.getName());
		 System.out.println(bean.getLogin());
		 System.out.println(bean.getPassword());
		 
		PersonBean dto = (PersonBean) context.getBean("person");
		System.out.println(dto.getAddress());
	}

}
