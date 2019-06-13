package com.sreedhar.service;

import java.util.List;
import com.sreedhar.model.*;


public interface CustomerService {

	 public List<CustomerModel> getAllCustomer();
	 
	 public CustomerModel getCustomerById(int id);
	 
	 public CustomerModel addCustomer(CustomerModel customer);
	 
	 public void updateCustomer(CustomerModel customer);
	 
	 public void deleteCustomer(int id);
	 
	}
