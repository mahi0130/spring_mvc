package com.rays.primary;

public class TwitterService implements MessageService {

	public void sendMessage(String message) {
		System.out.println("sending tweet "+ message);
	}
	

}
