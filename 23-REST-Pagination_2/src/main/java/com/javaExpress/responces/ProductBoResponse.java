package com.javaExpress.responces;

import java.util.List;

import com.javaExpress.models.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBoResponse {
	
	Integer totalPageNumber;	
	Integer numberOfElements; 
	Integer size;
	Integer number;
	List<Product> product;
	
	
	

}
