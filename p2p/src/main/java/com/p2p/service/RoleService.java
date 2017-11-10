package com.p2p.service;

import com.p2p.beans.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
public interface RoleService {
    public List<Role> findAllRoles(Map<String, Integer> params);
    public List<Role> findRoles();
    public int saveRole(Role role);
    public int delRoleById(int id);
    public int delRoleByIds(List<Integer> ids);
    public int modifyRole(Role role);
    public int findRoleNum();
    public int saveUserAndRole(Map<String, Integer> map);
}
