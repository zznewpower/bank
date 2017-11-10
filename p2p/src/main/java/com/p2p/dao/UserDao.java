package com.p2p.dao;

import com.p2p.beans.PreUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@Repository
@Mapper
public interface UserDao {
    public List<PreUsers> findAllUsers(Map<String, Integer> params);
    public int addUser(PreUsers user);
    public int deleteUserById(int UserId);
    public int deleteUserByIds(List<Integer> ids);
    public int modifyUserById(PreUsers user);
    public int findUserTol();
    public PreUsers login(PreUsers user);
}
