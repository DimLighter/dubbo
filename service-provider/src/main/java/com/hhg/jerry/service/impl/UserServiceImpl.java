package com.hhg.jerry.service.impl;

import com.hhg.jerry.UserService;
import com.hhg.jerry.model.User;

/**
 * Created by lining on 2018/10/25.
 */
public class UserServiceImpl implements UserService {
    public User getDummyUser() {
        User u =  new User();
        u.setId(-1L);
        u.setName("dummy");
        u.setAge(Integer.MAX_VALUE);
        return u;
    }
}
