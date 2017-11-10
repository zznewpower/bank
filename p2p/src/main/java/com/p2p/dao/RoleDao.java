package com.p2p.dao;


import com.p2p.beans.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@Repository
@Mapper
public interface RoleDao {
    public List<Role> findAllRoles(Map<String, Integer> params);
    public List<Role> findRoles();
    public int addRole(Role role);
    public int deleteRoleById(int id);
    public int deleteRoleByIds(List<Integer> ids);
    public int modifyRoleById(Role role);
    public int findRoleNum();
    public int saveUserAndRole(Map<String, Integer> map);
}
