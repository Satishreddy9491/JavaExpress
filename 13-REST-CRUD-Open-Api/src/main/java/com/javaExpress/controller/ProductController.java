package com.javaExpress.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javaExpress.models.Product;
import com.javaExpress.services.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController implements SwaggerInterface{
	@Autowired
	private ProductService productService;
	
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping("/create")
	public String saveProduct(@RequestBody @Valid Product product) {
		log.info("save product method is executed");
		productService.saveProduct(product);
		return "product created successfully";
	}
	
	
	@Operation(summary = "Retriveing all the product in data base")
	@GetMapping("/fetch")
	public List<Product> fetchAllProducts() {
		return productService.fetchProducts();
	} 
}
