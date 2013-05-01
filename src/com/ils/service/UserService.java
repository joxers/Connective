package com.ils.service;

import java.util.List;

import com.ils.entity.User;

public interface UserService {
 
    User getUserByUserName(String userName);
 
    List<String> getAuthoritiesByUserName(String userName);
    }