package com.example.SpringBootSecurityPractice.dao;

import com.example.SpringBootSecurityPractice.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);

}
