package com.zyh.conclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

	@Value("${config.server.value.test}")
	private String testValue;
	
	@GetMapping("/test")
	public String homeTest() {
	   return "Hello " + testValue;
	}
	
}
