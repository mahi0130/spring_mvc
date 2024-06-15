package com.rays.primary;

public class NotificationService {

	private MessageService messageservice;

	public void setMessageservice(MessageService messageservice) {
		this.messageservice = messageservice;
	}

	public void sendNotification(String message) {

		messageservice.sendMessage(message);
	}

}
