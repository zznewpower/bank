package com.p2p.service;

import com.p2p.beans.PreUsers;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
public interface UserService {
    public List<PreUsers> findAllUsers(Map<String, Integer> params);
    public int saveUser(PreUsers user);
    public int delUserById(int id);
    public int delUserByIds(List<Integer> ids);
    public int modifyUser(PreUsers user);
    public int findTol();

    public PreUsers login(PreUsers user);
}
