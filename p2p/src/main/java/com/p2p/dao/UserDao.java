package com.p2p.dao;

import com.p2p.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/11/7.
 */
@Repository
@Mapper
public interface UserDao {
    //登录
    public User login(User user);
}
