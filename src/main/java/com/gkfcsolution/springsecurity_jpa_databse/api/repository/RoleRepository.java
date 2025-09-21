package com.gkfcsolution.springsecurity_jpa_databse.api.repository;

import com.gkfcsolution.springsecurity_jpa_databse.api.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 15:17
 * File: null.java
 * Project: springsecurity_jpa_databse
 *
 * @author Frank GUEKENG
 * @date 20/09/2025
 * @time 15:17
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
