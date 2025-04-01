package com.yri.workshopmongodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class controller {
	
	@GetMapping
	public String helloWorld() {
		return "Olá mundo";
	}
}
