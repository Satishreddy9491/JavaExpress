package com.javaExpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.javaExpress.models.Categeroy;
import com.javaExpress.models.Product;
import com.javaExpress.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategeroyService categeroyService;
	
	@Autowired
	private PageRequest pageRequest;

	public void saveProduct(Product product) {
		
		//We need to check category id available in db or not
		//if available then set to product to object
		// We Need to store in db
		Categeroy dbCategery = categeroyService.featchCategeryById(product.getCategeroy().getId());	
		product.setCategeroy(dbCategery);
		productRepository.save(product);
	}

	public List<Product> fetchProducts() {
		return productRepository.findAll();
		
	}

	public Product featchProductInfo(String name) {
		return productRepository.findByName(name);
	}

	public Product featchProductInfo(String name, double price) {
		return productRepository.findByNameAndPrice(name, price);
	}

	public List<Product> fetchProduct() {
		return productRepository.fetchProductPagination(pageRequest);
	}

//	public Product featchInformation(String name,double price) {
//				return productRepository.findByNameOrPrice(name,price);
//	}
//
//	public List<Product> featchAllInformation(String name) {
//		return productRepository.findByNameContaining(name);
//	}

	

//	public List<Product> featchprice1(Double price) {
//		
//		return productRepository.findByPriceOrderByNameDesc(price);
//	}
	
	
//	public List<Product> featchless1(Double price) {
//		return productRepository.findByPriceLessThan(price);
//	}
	
//	public List<Product> featchGreater1(Double price) {
//		return productRepository.findByPriceGreaterThan(price);
//	}
	
//	public List<String> featchin1(String name) {
//		
//		return productRepository.findByNameIn();
//	}
	
	
	
}
