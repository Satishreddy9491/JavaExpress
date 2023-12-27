package com.javaExpress.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.javaExpress.models.Categeroy;
import com.javaExpress.models.Product;
@Service

public class ProductClient {

	@Autowired
	private RestTemplate restTemplate;
	
	public void createProduct() {
		
		try{
			String url= "http://localhost:8081/product/api/create";
			Product p=new Product();
			p.setName("I phone 14");
			p.setPrice(97000d);
			p.setDescription("Mobile phones");
			p.setActive(true);
			
			Categeroy categeroy =new Categeroy();
			categeroy.setId(1);
			
			p.setCategeroy(categeroy);
			
			HttpHeaders headers =new HttpHeaders();
			headers.set("Accept","application/json");
			headers.set("Content-Type", "application/json");
			
			HttpEntity<Product>httpEntity=new HttpEntity<Product>(p,headers);
			
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
			
			if(responseEntity.getStatusCode().value()==201) {
				System.out.println(responseEntity.getBody());
			}
			
		}
		
		catch(HttpClientErrorException ex) {
			System.out.println(ex.getMessage());
		}
		
		catch(ResourceAccessException ex) {
			System.out.println(ex.getMessage());
		}
		
		catch(Exception ex) {
			System.out.println("something went wrong while access rest URL "+ex.getLocalizedMessage());
		}
		
	}

	public void featchAllProduvctInfromation() {
		String url= "http://localhost:8081/product/api/fetch";
		restTemplate.getForEntity(url,Product.class);
	}
	
	public void featchProductInformation() {
		String url= "http://localhost:8081/product/api/opp";
		restTemplate.getForEntity(url,Product.class);
	}
	
	
}
