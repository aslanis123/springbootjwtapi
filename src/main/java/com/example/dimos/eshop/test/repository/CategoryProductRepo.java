package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.CategoryProduct;
import org.springframework.data.repository.CrudRepository;

public interface CategoryProductRepo extends CrudRepository<CategoryProduct, Long> {
}
