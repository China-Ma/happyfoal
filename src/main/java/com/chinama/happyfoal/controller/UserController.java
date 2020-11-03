package com.chinama.happyfoal.controller;

import com.chinama.happyfoal.entity.User;
import com.chinama.happyfoal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author China-Ma
 * @date
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        user.setCreatedate(new Date());
        int i = userService.addUser(user);
        if (i == 0){
            return "角色新增失败";
        }
        return "新增成功";
    }

    @RequestMapping("/selectUsers")
    public List selectUsers(){
        List<User> users = userService.selectUsers();
        return users;
    }

}
