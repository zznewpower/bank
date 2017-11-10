package com.p2p.service;

import com.p2p.beans.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
public interface UserService {
    public List<User> findAllUsers(Map<String, Integer> params);
    public int saveUser(User user);
    public int delUserById(int id);
    public int delUserByIds(List<Integer> ids);
    public int modifyUser(User user);
    public int findTol();

    public User login(User user);
}
