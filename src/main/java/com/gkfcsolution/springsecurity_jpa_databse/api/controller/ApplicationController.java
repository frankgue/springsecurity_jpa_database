package com.gkfcsolution.springsecurity_jpa_databse.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 13:45
 * File: null.java
 * Project: springsecurity_jpa_databse
 *
 * @author Frank GUEKENG
 * @date 21/09/2025
 * @time 13:45
 */
@RestController
@RequestMapping("/public/api/rest")
public class ApplicationController {

    @GetMapping("/process")
    public String process(){
        return "processing...";
    }
}
