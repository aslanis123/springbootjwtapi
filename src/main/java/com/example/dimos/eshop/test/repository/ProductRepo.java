package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Long> {
}
