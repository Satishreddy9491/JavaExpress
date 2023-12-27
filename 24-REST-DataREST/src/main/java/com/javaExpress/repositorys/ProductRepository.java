package com.javaExpress.repositorys;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javaExpress.model.Product1;

@Repository
public interface ProductRepository extends JpaRepository<Product1, Integer> {
	
}