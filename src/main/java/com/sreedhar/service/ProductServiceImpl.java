package com.sreedhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreedhar.Repository.ProductRepository;
import com.sreedhar.model.ProductEntity;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		// TODO Auto-generated method stub
		List<ProductEntity> products = productRepository.findAll();
		return products;
	}

}
