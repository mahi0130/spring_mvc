package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testuserservice")
public class TestUserService {
	@Autowired
	public UserServiceInt service = null;
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mahi.xml");
		 TestUserService test = (TestUserService) context.getBean("testuserservice");
		 test.testAdd();
		
		
	}
	
	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("Mahi");
		dto.setLastName("singh");
		dto.setLogin("mahi@123");
		dto.setPassword("pass123");
		long pk = service.add(dto);
		System.out.println("data inserted......." + pk);
		
		
	}
	
	
	
	

}
