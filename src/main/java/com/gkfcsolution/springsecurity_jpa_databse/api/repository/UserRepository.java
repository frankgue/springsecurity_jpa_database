package com.gkfcsolution.springsecurity_jpa_databse.api.repository;

import com.gkfcsolution.springsecurity_jpa_databse.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created on 2025 at 15:16
 * File: null.java
 * Project: springsecurity_jpa_databse
 *
 * @author Frank GUEKENG
 * @date 20/09/2025
 * @time 15:16
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
