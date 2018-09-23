package com.luobo.service;

import com.luobo.dao.UserMapper;
import com.luobo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

   public List<User> findAll(){
        return userMapper.selectByExample(null);
    }

}
