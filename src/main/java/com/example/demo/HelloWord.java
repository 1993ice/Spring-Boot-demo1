package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
	@RequestMapping("/hello")
	
	public String hello() {
		return "Hello Word ice";
	}

}
