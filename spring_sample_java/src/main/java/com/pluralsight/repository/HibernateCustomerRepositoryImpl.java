package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;
import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Value; 

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository{

	@Value("${dbUsername}")
	private String dbUsername;

	@Override
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Moulton");
		customer.setLastname("Lehr");

		customers.add(customer);

		return customers;
	}
}