package com.gkfcsolution.springsecurity_jpa_databse.api.service;

import com.gkfcsolution.springsecurity_jpa_databse.api.model.User;
import com.gkfcsolution.springsecurity_jpa_databse.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created on 2025 at 12:04
 * File: null.java
 * Project: springsecurity_jpa_databse
 *
 * @author Frank GUEKENG
 * @date 21/09/2025
 * @time 12:04
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not exist with name :" + username));
        CustomUserDetails userDetails = new CustomUserDetails();
        userDetails.setUser(user);
        return userDetails;
    }
}
