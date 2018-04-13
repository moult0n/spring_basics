package com.pluralsight.service;

import java.util.List;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}