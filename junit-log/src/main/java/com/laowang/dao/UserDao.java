package com.laowang.dao;

import com.laowang.entity.User;
import com.laowang.util.DbHelp;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class UserDao {

    public void save(User user) {
        String sql = "INSERT INTO user(name, tel) VALUEs(?,?)";
        DbHelp.update(sql,user.getName(),user.getTel());
    }

    public User findById(Integer id) {
        String sql = "select * from user where id = ?";
        return DbHelp.query(sql,new BeanHandler<>(User.class),id);
    }

    public List<User> findAll() {
        String sql = "select * from user";
        return DbHelp.query(sql,new BeanListHandler<>(User.class));
    }

    public void del(int id) {
        String sql = "delete from user where id = ?";
        DbHelp.update(sql,id);
    }
}
