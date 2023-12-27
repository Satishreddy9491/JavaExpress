package com.javaExpress.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/product/api")
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
	
	@GetMapping("/{name}")
	public Product featchProductInformation(@PathVariable("name") String name) {
		return productService.featchProductInfo(name);
	}
	
//	@GetMapping("/{name}/{price}")
//	public Product featchProductInformation(@PathVariable String name, Double price) {
//		return productService.featchProductInfo(name,price);
//	}
//	
//	@GetMapping("/{name1}")
//	public Product featchInformation(@PathVariable("name1/") String name,Double price) {
//		return productService.featchInformation(name,price);
//	}
//	
//	@GetMapping("/name2")
//	public List<Product> featchAllInfo(String name){
//		return productService.featchAllInformation(name);
//	}
	
//	@GetMapping("/{findByPriceOrderByNameDesc}")
//	public List<Product> featchPrice(@PathVariable("findByPriceOrderByNameDesc") Double price){
//		return productService.featchprice1(price);
//	}
	
//	@GetMapping("/{findByPriceLessthan}")
//	public List<Product>featchLess(@PathVariable("findByPriceLessthan")Double price){
//		return productService.featchless1(price);
//	}
	
	
//	@GetMapping("/{findByPriceGreaterThan}")
//	public List<Product> featchGreater(@PathVariable("findByPriceGreaterThan") Double price){
//		return productService.featchGreater1(price);
//	}
	
//	@GetMapping("/{findByNameIn}")
//	public List<String> featchin(@PathVariable("findByNameIn")String name){
//		return productService.featchin1(name);
//	}
	
	
}
