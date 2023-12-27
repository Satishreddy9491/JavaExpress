package com.javaExpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportsController {

	@GetMapping("/reports")
	public String  featchReports() {
		return "Reports Controller Excuted by ADMIN";
	}
}
