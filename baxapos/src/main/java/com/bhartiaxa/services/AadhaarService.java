package com.bhartiaxa.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="aadhar")
public class AadhaarService {
	
	
	@GetMapping
	public String getAadhaarDetails() {
		
		String str= "AShim anand ";
		return str;
		
	}

}
