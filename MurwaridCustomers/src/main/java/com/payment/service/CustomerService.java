package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.repository.CustomerRepo;

@Service

public class CustomerService {
	@Autowired
	CustomerRepo customerRepo;

}
