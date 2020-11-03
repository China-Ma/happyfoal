package com.chinama.happyfoal.service.impl;

import com.chinama.happyfoal.entity.User;
import com.chinama.happyfoal.mapper.UserMapper;
import com.chinama.happyfoal.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author China-Ma
 * @date
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectUsers() {
        return userMapper.selectAll();
    }

}
