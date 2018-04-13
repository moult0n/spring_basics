package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

import org.springframework.beans.factory.annotation.Value;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;

	//public void setDbUsername(String dbUsername){
	//	this.dbUsername = dbUsername;
	//}

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);

		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Moulton");
		customer.setLastname("Lehr");
		
		customers.add(customer);
		
		return customers;
	}
}
