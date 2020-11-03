package com.chinama.happyfoal.service;

import com.chinama.happyfoal.entity.User;

import java.util.List;

/**
 * @author China-Ma
 * @date
 */
public interface UserService {
    /**
     * 角色新增
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectUsers();
}
