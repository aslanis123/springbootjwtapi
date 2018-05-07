package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepo extends CrudRepository<Order, Long> {
    List<Order> findAll();
}
