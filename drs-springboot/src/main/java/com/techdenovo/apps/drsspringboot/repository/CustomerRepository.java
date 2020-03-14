package com.techdenovo.apps.drsspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdenovo.apps.drsspringboot.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
