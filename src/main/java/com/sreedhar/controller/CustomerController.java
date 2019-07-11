package com.sreedhar.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.sreedhar.model.CustomerModel;
import com.sreedhar.model.ProductEntity;
import com.sreedhar.service.CustomerServiceImpl;
import com.sreedhar.service.ProductService;

@RestController
public class CustomerController {
	
	@Autowired
	private ProductService productService;
 
 @Autowired
 private CustomerServiceImpl customerService;
 
 @GetMapping("/customer/")
 public List<CustomerModel> getAllCustomer(){
  return customerService.getAllCustomer();
 }
 @GetMapping("/product/")
 public List<ProductEntity> getAllProducts(){
  return productService.getAllProducts();
 }
 
 @GetMapping("/customer/{customerId}")
 public CustomerModel getCustomerById(@PathVariable int customerId) {
  return customerService.getCustomerById(customerId);
 }
 
 @PostMapping("/customer/")
 public ResponseEntity<Void> addCustomer(@RequestBody CustomerModel newCustomer, UriComponentsBuilder builder){
  CustomerModel customer = customerService.addCustomer(newCustomer);
  
  if(customer == null) {
   return ResponseEntity.noContent().build();
  }
  
  HttpHeaders headers = new HttpHeaders();
  headers.setLocation(builder.path("/customer/{id}").buildAndExpand(customer.getId()).toUri());
  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
 }
 
 @PutMapping("/customer/")
 public ResponseEntity<CustomerModel> updateCustomer(@RequestBody CustomerModel customer){
  CustomerModel c = customerService.getCustomerById(customer.getId());
  
  if(c == null) {
   return new ResponseEntity<CustomerModel>(HttpStatus.NOT_FOUND);
  }
  
  c.setName(customer.getName());
  c.setEmail(customer.getEmail());
  c.setDescription(customer.getDescription());
  
  customerService.updateCustomer(c);
  return new ResponseEntity<CustomerModel>(c, HttpStatus.OK);
 }
 
 @DeleteMapping("/customer/{customerId}")
 public ResponseEntity<CustomerModel> deleteCustomer(@PathVariable int customerId){
  CustomerModel c = customerService.getCustomerById(customerId);
  
  if(c == null) {
   return new ResponseEntity<CustomerModel>(HttpStatus.NOT_FOUND);
  }
  
  customerService.deleteCustomer(customerId);
  return new ResponseEntity<CustomerModel>(HttpStatus.NO_CONTENT);
 }
}