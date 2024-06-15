package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Test")
public class TestCtl {
	
	@GetMapping
	public void display() {
		System.out.println("this is a display method");
	}
	
	

}
