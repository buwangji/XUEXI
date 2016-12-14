package com.laowang.dao;

import com.laowang.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class UserDaoTest {

    private UserDao userDao;
    @Before
    public void setUp() throws Exception {
        userDao = new UserDao();
    }

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setName("junit");
        user.setTel("028-2394825");

        userDao.save(user);

    }

    @Test
    public void findById() throws Exception {
        User user = userDao.findById(3);

        assertNotNull(user);

    }

    @Test
    public void findAll() {
        List<User> userList = userDao.findAll();
        assertEquals(9,userList.size());

    }

    @Test
    public void del() throws Exception {
        userDao.del(1);

    }

}