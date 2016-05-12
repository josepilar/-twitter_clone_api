package com.clone.twitter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	
	@RequestMapping("/")
	public String helloWorld(){
		return "HELLO PERRO";
	}
}
