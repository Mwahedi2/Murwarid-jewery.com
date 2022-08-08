package com.payment.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.Customer;
import com.payment.repository.CustomerRepo;

@RestController

public class CustomerController {
	@Autowired
	private CustomerRepo repository;
	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		repository.save(customer);
		return "Customer saved";
		
	}
	@GetMapping("/getCustomer/{email}")
	public List<Customer>getCustomerByEmail(@PathVariable String email) {
		return repository.findByEmail(email);
	}
	
	

}
