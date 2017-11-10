package com.p2p.service.impl;

import com.p2p.beans.Role;
import com.p2p.dao.RoleDao;
import com.p2p.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/16.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAllRoles(Map<String, Integer> params) {

        return roleDao.findAllRoles(params);
    }

    @Override
    public int saveRole(Role role) {

        return roleDao.addRole(role);
    }

    @Override
    public int saveUserAndRole(Map<String, Integer> map) {
        return roleDao.saveUserAndRole(map);
    }

    @Override
    public List<Role> findRoles() {
        return roleDao.findRoles();
    }

    @Override
    public int delRoleById(int roleId) {

        return roleDao.deleteRoleById(roleId);
    }

    @Override
    public int delRoleByIds(List<Integer> ids) {

        return roleDao.deleteRoleByIds(ids);
    }

    @Override
    public int modifyRole(Role role) {

        return roleDao.modifyRoleById(role);
    }

    @Override
    public int findRoleNum() {
        return roleDao.findRoleNum();
    }
}
