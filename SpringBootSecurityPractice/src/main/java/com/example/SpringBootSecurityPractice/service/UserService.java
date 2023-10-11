package com.example.SpringBootSecurityPractice.service;

import com.example.SpringBootSecurityPractice.entity.User;
import com.example.SpringBootSecurityPractice.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    void save(WebUser webUser);
}
