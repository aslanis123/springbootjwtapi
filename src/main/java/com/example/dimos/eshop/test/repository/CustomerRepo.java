package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    List<Customer> findAll();

    Customer findById(Integer id);
}
