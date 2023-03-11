package com.bank.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
	
	@GetMapping("/notices")
	public String getNoticesDetails() {
		return "Notices details";
	}

}
