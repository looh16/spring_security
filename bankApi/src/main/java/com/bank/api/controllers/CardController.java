package com.bank.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	
	@GetMapping("/cards")
	public String getCardDetails() {
		return "cards details";
	}

}
