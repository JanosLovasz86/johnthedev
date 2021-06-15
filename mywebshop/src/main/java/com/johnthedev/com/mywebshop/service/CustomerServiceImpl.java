package com.johnthedev.com.mywebshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.johnthedev.com.mywebshop.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> findAll() {
		
		return null;
	}

	@Override
	public Customer findById(int theId) {
		
		return null;
	}

	@Override
	public void save(Customer theCustomer) {

	}

	@Override
	public void deleteById(int id) {

	}

}
