package com.rays.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNotificationService {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Primary.xml");
			NotificationService ns = (NotificationService)	context.getBean("notificationservice");
			
			ns.sendNotification("hello mahi.....its spring");
	}

}
