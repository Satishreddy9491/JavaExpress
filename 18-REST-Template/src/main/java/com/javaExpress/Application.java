package com.javaExpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javaExpress.client.ProductClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductClient productClient = context.getBean(ProductClient.class);
		productClient.createProduct(); 
	}

}
