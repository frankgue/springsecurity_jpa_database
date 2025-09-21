package com.gkfcsolution.springsecurity_jpa_databse.api.controller;

import com.gkfcsolution.springsecurity_jpa_databse.api.model.User;
import com.gkfcsolution.springsecurity_jpa_databse.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 15:19
 * File: null.java
 * Project: springsecurity_jpa_databse
 *
 * @author Frank GUEKENG
 * @date 20/09/2025
 * @time 15:19
 */
@RestController
@RequestMapping("/api/rest/secure")
public class AdminController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/admin/add")
    public String addUserByAdmin(@RequestBody User user){
        String pwd = user.getPassword();
        String encryptedPassword = passwordEncoder.encode(pwd);
        user.setPassword(encryptedPassword);
        userRepository.save(user);
        return "User added successfully by an Admin...";
    }
}
