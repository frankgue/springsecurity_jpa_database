package com.gkfcsolution.springsecurity_jpa_databse;

import com.gkfcsolution.springsecurity_jpa_databse.api.model.Role;
import com.gkfcsolution.springsecurity_jpa_databse.api.model.User;
import com.gkfcsolution.springsecurity_jpa_databse.api.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.List;
import java.util.Set;

@SpringBootApplication
@EnableWebSecurity
public class SpringsecurityJpaDatabseApplication {

    @Autowired
    private UserRepository userRepository;

//    @PostConstruct
//    public void initUser() {
//        User adminUser = User.builder()
//                .username("admin")
//                .email("admin@gmail.com")
//                .password("Admin123")
//                .roles((Set<Role>) List.of(new Role(12,"ADMIN")))
//				.build();
//    }


    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityJpaDatabseApplication.class, args);
    }

}
