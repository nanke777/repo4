package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.demo.User;


import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private List<String> list;
    private Map<String,User> map;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private  String username;
    private  int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save() {
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);
        System.out.println(username+"========"+age);
        System.out.println("save running");
    }
}
