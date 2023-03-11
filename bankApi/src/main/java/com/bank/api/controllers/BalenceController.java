package com.bank.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalenceController {
	
	@GetMapping("/balance")
	public String getBalanceDetails() {
		return "Balance details";
	}

}
