package com.p2p.dao;

import com.p2p.beans.Res;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@Repository
@Mapper
public interface ResDao {
    public List<Res> findAllRes();
    public int saveRoleResource(Map<String, Object> map);
    public int delRoleResource(int rid);

    //根据用户id查询用户权限
    public List<Res> findRoleRes(int uid);
}
