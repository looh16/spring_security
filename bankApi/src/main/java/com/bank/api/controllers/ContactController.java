package com.bank.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping("/contacts")
	public String getContactDetails() {
		return "Contact details";
	}

}
