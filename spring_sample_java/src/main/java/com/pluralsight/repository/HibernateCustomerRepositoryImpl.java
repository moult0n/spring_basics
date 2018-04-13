package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;
import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository{

	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Moulton");
		customer.setLastname("Lehr");

		customers.add(customer);

		return customers;
	}
}