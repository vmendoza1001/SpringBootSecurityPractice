package com.example.SpringBootSecurityPractice.service;

import com.example.SpringBootSecurityPractice.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);
}
