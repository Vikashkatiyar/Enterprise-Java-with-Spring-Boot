package com.learn.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankRestController {
  
	
	@GetMapping("/")
	public String WelcomePage() {
		return "Welcome to ICICI Bank";
	}
	
	@GetMapping("/transfer")
	public String fundTransfer() {
		return "FUnd Transfer initiated";
	}
	
	@GetMapping("/balance")
	public String checkBalanace() {
		return "Balanace amount is :: 1***INR";
	}
	
	@GetMapping("/about")
	public String aboutUs() {
		return "ICICI bank is managed by India central Gov.";
	}
}
