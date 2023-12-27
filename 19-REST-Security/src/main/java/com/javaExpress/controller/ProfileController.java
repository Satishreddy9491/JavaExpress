package com.javaExpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	@GetMapping("profile")
	public String getProfileDetails() {
		return "Profile Controller is Secured";
	}
	
}
