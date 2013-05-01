package com.ils.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ils.dao.UserDao;
import com.ils.entity.Authority;
import com.ils.entity.User;
 
public class UserDaoImpl implements UserDao {
 
    HibernateTemplate hibernateTemplate;
 
    private String queryString = "from User where username = ?";
 
    public void setHibernateTemplate(HibernateTemplate arg0) {
        hibernateTemplate = arg0;
    }
 
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
 
    @Override
    public User getUserByUserName(String userName) {
        return (User) hibernateTemplate.find(queryString, userName).get(0);
    }
 
    @Override
    public List<String> getAuthoritiesByUserName(String userName) {
        User u = (User) hibernateTemplate.find(queryString, userName).get(0);
        Authority a = u.getAuthority();
        String auth = a.getAuthority();
        List<String> l = new ArrayList<String>();
        l.add(auth);
        return l;
    }
 
}