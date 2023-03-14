package com.bank.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.api.model.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}