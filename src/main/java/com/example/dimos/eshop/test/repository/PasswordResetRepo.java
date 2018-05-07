package com.example.dimos.eshop.test.repository;

import com.example.dimos.eshop.test.domain.PasswordReset;
import org.springframework.data.repository.CrudRepository;

public interface PasswordResetRepo extends CrudRepository<PasswordReset, Long> {
}
