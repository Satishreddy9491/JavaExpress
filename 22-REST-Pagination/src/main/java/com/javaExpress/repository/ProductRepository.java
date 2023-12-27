package com.javaExpress.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javaExpress.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	@Query("select p from Product p")
	 List<Product> fetchProductPagination(Pageable pageble);
	
	Product findByName(String name);
	
	Product findByNameAndPrice(String name,double price);
	
	Product findByNameOrPrice(String name,double price);
	
	List<Product> findByNameContaining(String name);
	
	
	//get all products by price and sort by name in desc or descending order
	
	List<Product> findByPriceOrderByNameDesc(double price);
	
	List<Product> findByPriceLessThan(double price);
	
	List<Product> findByPriceGreaterThan(double price);
	
//	List<Product> findByNameIn(String name);
	
	
	// HQL Queries 
	
	@Query("select p from Product p")
	List<Product>featchAllProducts();
	
	@Query("select p.name from 	Product p where p.id=?1")
	public String featchProductNameById(Integer productId);
	
	@Query("select p.name from Product p where p.id=productId")
	public String fetchProductNameByIdBinding(Integer productId);
	
	@Query("select p from Product p where p.description =:description")
	public Product featchProductByDesc(String description);
	
	@Query(value="select * from Products as p where p.descp=?1",nativeQuery = true)
	public Product featchProductByDescUsingNative(String description);
	
	@Query("select p from Product p where p.id=:productId and p.name=:productName")
	public Product fetchProductByNameAndId(Integer productId,String productName);
	
	@Query("select p from Product p where p.name LIKE %?1%")
	public List<Product>fetchProducts(String keyword);
	
	@Query("select p from Product p where p.name LIKE %?1% "
			+ " OR p.description LIKE %?1%"
			+ " OR p.categeroy.name LIKE %?1%")
	public List<Product>fetchProducts1(String keyword);
	
	@Transactional
	@Query("UPDATE Product p SET p.active =?2 where p.id=?1")
	@Modifying
	public void updateEnabledStatus(Integer id,boolean enabled);

	
	
}



