package com.assessment.controller;

import com.assessment.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController
{
    @GetMapping("/authentication")
    public String authrizeUser(@RequestBody User user)
    {
        return "";
    }
}
