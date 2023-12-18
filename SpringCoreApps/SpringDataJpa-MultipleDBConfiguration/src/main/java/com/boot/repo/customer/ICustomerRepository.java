package com.boot.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.config.model.customer.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
