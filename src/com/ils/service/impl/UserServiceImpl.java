package com.ils.service.impl;

import java.util.List;

import com.ils.dao.UserDao;
import com.ils.entity.User;
import com.ils.service.UserService;
 
public class UserServiceImpl implements UserService {
 
    UserDao userDao;
 
    @Override
    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }
 
    @Override
    public List<String> getAuthoritiesByUserName(String userName) {
        return userDao.getAuthoritiesByUserName(userName);
    }
 
    public UserDao getUserDao() {
        return userDao;
    }
 
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
 
}