package com.javaExpress.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.javaExpress.models.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface SwaggerInterface {
	@Operation(summary = "create new product in data base")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201",description = "product is created in DB"),
			@ApiResponse(responseCode = "401",description = "Unauthorized user",content = @Content),
			@ApiResponse(responseCode = "403",description = "Sufficent privilages not avialable for this user",content = @Content)
			
	})
	public String saveProduct(@RequestBody @Valid Product product);
	
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200",description = "Retriving all products Successfully from dataBase"),
			@ApiResponse(responseCode = "404",description = "Resouces URL is NOt found"),
			
	})
	public List<Product> fetchAllProducts();
}


