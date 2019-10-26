package com.zyh.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyh.consumer.client.HelloRemoteClient;

@RestController
public class HelloController {
	
	@Autowired
    HelloRemoteClient helloRemoteClient;
	
	@GetMapping("/hello/remote/test")
	public String invokeHelloRemote() {
		String helloWord = "Remote invote test: " + helloRemoteClient.hello();
		System.out.println(helloWord);
		return helloWord;
	}
}
