package com.example.AWSDeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping("/getName")
	public String getName() {
		return "Rahul Kumar Dixit";
	}
}
