package com.example.SpringBootSecurityPractice.dao;

import com.example.SpringBootSecurityPractice.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User user);
}
