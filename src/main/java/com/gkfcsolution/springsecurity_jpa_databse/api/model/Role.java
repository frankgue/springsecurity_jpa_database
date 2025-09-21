package com.gkfcsolution.springsecurity_jpa_databse.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Builder
@Entity
@Table(name = "ROLE_TBL")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;
    private String role_name;
}
