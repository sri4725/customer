package com.sreedhar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.sreedhar.model.*;

@Component
public class CustomerServiceImpl implements CustomerService {
 
 private static List<CustomerModel> customers = new ArrayList<>();
 
 static {
  CustomerModel c1 = new CustomerModel(1, "Ravi", "Ravi@gmail.com", "This is a Ravi");
  CustomerModel c2 = new CustomerModel(2, "Raj", "Raj@gmail.com", "This is a Raj");
  CustomerModel c3 = new CustomerModel(3, "Ram", "Ram@gmail.com", "This is a Ram");
  
  customers.add(c1);
  customers.add(c2);
  customers.add(c3);
 }

 @Override
 public List<CustomerModel> getAllCustomer() {
  return customers;
 }

 @Override
 public CustomerModel getCustomerById(int id) {
  for(CustomerModel customer : customers) {
   if(customer.getId() == id) {
    return customer;
   }
   System.out.println(customer.getId());
  }
  return null;
 }

 @Override
 public CustomerModel addCustomer(CustomerModel customer) {
  Random random = new Random();
  int nextId = random.nextInt(1000) + 10;
  
  customer.setId(nextId);
  customers.add(customer);
  
  return customer;
 }

 @Override
 public void updateCustomer(CustomerModel customer) {
  for(CustomerModel oldCustomer : customers) {
   if(oldCustomer.getId() == customer.getId()) {
    oldCustomer.setName(customer.getName());
    oldCustomer.setEmail(customer.getEmail());
    oldCustomer.setDescription(customer.getDescription());
   }
  }
 }

 @Override
 public void deleteCustomer(int id) {
  for(CustomerModel c : customers) {
   if(c.getId() == id) {
    customers.remove(c);
    break;
   }
  }
 }

}
