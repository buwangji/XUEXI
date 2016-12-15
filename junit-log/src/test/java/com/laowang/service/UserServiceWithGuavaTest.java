package com.laowang.service;

import com.laowang.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceWithGuavaTest {

    private UserService userService = new UserService();

    @Test
    public void findById() throws Exception {
        User user = userService.findById(1);
        user = userService.findById(5);

        System.out.println(user.getName());
    }

}