package com.bank.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.api.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	List<Customer> findByEmail(String email);
}
