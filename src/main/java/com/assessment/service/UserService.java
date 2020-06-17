package com.assessment.service;

import com.assessment.repository.UserRepository;
import com.assessment.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    public void save(User user)
    {
        try
        {
            userRepository.save(user);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId)
    {
        userRepository.deleteById(userId);
    }

    public User getById(int userId)
    {
        User user = userRepository.getOne(userId);
        return user;
    }

//    public Page<User> getAllUsers()
//    {
//        return userRepository.findAll(PageRequest.of(page.orElse(0) , 5 ));
//    }
}
