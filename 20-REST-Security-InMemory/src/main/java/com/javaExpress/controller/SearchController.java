package com.javaExpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

	@GetMapping("/search")
	public String featchProduct() {
		return "Search Controller executed -No secure";
	}
}
