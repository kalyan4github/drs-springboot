package com.techdenovo.apps.drsspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techdenovo.apps.drsspringboot.model.Customer;
import com.techdenovo.apps.drsspringboot.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public List<Customer> listAll() {
        return customerRepo.findAll();
    }

	public void saveCustomer(Customer customer) {
		customerRepo.save(customer);
	}
}
