package com.joe.ssm.controller;

import com.joe.ssm.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {
    @Autowired
    private ServiceB serviceB;

    @GetMapping("/testB")
    public String testControllerB() {
        return serviceB.testB();
    }
}