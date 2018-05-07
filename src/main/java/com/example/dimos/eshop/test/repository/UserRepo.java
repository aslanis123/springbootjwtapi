package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepo extends CrudRepository<User, Long> {

    User findByName(String username);

    boolean existsByName(String username);


}
