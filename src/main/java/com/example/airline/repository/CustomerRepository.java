package com.example.airline.repository;

import com.example.airline.model.Customer;
import com.example.airline.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByStatus(CustomerStatus status);
    List<Customer> findByTotalMilesFlownGreaterThan(Integer miles);
}