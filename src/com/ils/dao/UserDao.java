package com.ils.dao;

import java.util.List;
import com.ils.entity.User;

public interface UserDao {
 
    public User getUserByUserName(String userName);
 
    List<String> getAuthoritiesByUserName(String userName);
}