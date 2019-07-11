//package com.sreedhar.RepositoryImpl;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.sreedhar.Repository.ProductRepository;
//
//@Repository
//public abstract class ProductRepositoryImpl implements ProductRepository {
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	public void getAllProducts() {
//
//		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from product");
//		for (Map row : rows) {
//			System.out.println(row);
//
//			// String Query= "Select * from product";
//
//		}
//
//	}
//}
//	


