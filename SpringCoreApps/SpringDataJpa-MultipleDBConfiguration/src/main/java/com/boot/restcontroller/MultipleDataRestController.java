package com.boot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.boot.config.model.customer.Customer;
import com.boot.config.model.product.Product;
import com.boot.repo.customer.ICustomerRepository;
import com.boot.repo.product.IProductRepository;


@RestController
@RequestMapping("/api")
public class MultipleDataRestController {
   
	@Autowired
	private ICustomerRepository customerRepo;
	
	@Autowired
	private IProductRepository productRepo;
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return productRepo.findAll();
		
	}
	
	@GetMapping("/customer")
	public List<Customer> findAllCustomer(){
		return customerRepo.findAll();
		
	}
	
	
	
}
