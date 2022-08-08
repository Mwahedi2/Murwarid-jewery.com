package com.payment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.payment.model.Customer;
@Component

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	List<Customer> findByEmail(String email);

}
