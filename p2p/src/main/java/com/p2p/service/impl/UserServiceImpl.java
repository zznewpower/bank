package com.p2p.service.impl;

import com.p2p.beans.User;
import com.p2p.dao.UserDao;
import com.p2p.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/7.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int delUserByIds(List<Integer> ids) {
        return userDao.deleteUserByIds(ids);
    }

    @Override
    public int delUserById(int userId) {
        int i = userDao.deleteUserById(userId);
        return i;
    }

    @Override
    public int saveUser(User user) {
        int rol = userDao.addUser(user);
        return rol;
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public int findTol() {

        return userDao.findUserTol();
    }

    public List<User> findAllUsers(Map<String,Integer> params){
        List<User> users= userDao.findAllUsers(params);
        return users;
    }

    @Override
    public int modifyUser(User user) {
        return userDao.modifyUserById(user);
    }
}
