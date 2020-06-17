package com.assessment.controller;

import com.assessment.repository.UserRepository;
import com.assessment.domain.User;
import com.assessment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/list")
    public Page<User> getUsers(@RequestParam Optional<Integer> page)
    {
        return userRepository.findAll(PageRequest.of(page.orElse(0) , 5 ));
    }

    @GetMapping("/getUser/{userId}")
    public Optional<User> getUsersById(@PathVariable int userId) throws ResourceNotFoundException
    {
        return userRepository.findById(userId);
    }

    @PostMapping("/newUser")
    public void newUser(@RequestBody User theUser)
    {
        userService.save(theUser);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User theUser)
    {
        userService.save(theUser);
        return theUser;
    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId)
    {
        userService.deleteUser(userId);
        return "User id - " + userId + " is deleted.";
    }
}
