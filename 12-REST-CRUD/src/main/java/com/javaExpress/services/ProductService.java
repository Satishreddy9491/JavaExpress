package com.javaExpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
