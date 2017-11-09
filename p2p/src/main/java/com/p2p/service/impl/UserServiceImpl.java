package com.p2p.service.impl;

import com.p2p.beans.User;
import com.p2p.dao.UserDao;
import com.p2p.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/11/7.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
