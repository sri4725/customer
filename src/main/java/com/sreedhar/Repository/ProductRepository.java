package com.sreedhar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreedhar.model.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,String>{
	
	public static void getAllProducts() {
		
		
}
}
