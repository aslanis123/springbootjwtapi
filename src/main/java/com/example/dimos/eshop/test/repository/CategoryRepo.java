package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
