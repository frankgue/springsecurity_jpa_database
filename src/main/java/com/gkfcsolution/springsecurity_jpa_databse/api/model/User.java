package com.gkfcsolution.springsecurity_jpa_databse.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * Created on 2025 at 14:51
 * File: null.java
 * Project: springsecurity_jpa_databse
 *
 * @author Frank GUEKENG
 * @date 20/09/2025
 * @time 14:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
@Entity
@Table(name = "USER_TBL")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String password;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;
}
