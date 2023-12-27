package com.javaExpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	@GetMapping("/register")
	public String createUser() {
		return "user is Created - No Secure";
	}
}
