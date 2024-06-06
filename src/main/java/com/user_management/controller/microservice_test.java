package com.user_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class microservice_test {


    @GetMapping({"/testing"})
    public String test_User_Managment() {
        return "testing User_Managment Microservice";
    }
}
