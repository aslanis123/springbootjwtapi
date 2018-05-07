package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.WeightLimit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeightLimitRepo extends CrudRepository<WeightLimit, Long> {
    List<WeightLimit> findAll();
}
