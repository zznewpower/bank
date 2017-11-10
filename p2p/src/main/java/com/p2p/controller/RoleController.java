package com.p2p.controller;

import com.p2p.beans.Role;
import com.p2p.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;


    @RequestMapping("/roles")
    public List<Role> selectRole(int page, int size) {
        Map<String, Integer> params = new HashMap<>();
        int start = (page - 1) * size;
        params.put("start", start);
        params.put("size", size);
        List<Role> roles = roleService.findAllRoles(params);
        System.out.println(roles);
        return roles;
    }

    @RequestMapping("findAllRoles")
    public List<Role> findAllRoles(){
        return roleService.findRoles();
    }
    @RequestMapping("addRole")
    public int saveUser(Role role) {

        int rol = roleService.saveRole(role);
        return rol;
    }

    @RequestMapping("/delRole")
    public int delRole(Integer roleId) {
        return roleService.delRoleById(roleId);
    }

    @RequestMapping("/delRoles")
    public int delRoles(@RequestBody ArrayList<Integer> ids) {

        return roleService.delRoleByIds(ids);
    }

    @RequestMapping("/modifyRole")
    public int modifyUser(Role role) {

        return roleService.modifyRole(role);
    }

    @RequestMapping("/findRoleTol")
    public int findRoleTol() {

        return roleService.findRoleNum();
    }

    @RequestMapping("saveUserAndRole")
    public int saveUserAndRole(int userid,int roleid){
        Map<String,Integer> map = new HashMap<>();
        map.put("userid",userid);
        map.put("roleid",roleid);
        return roleService.saveUserAndRole(map);
    }
}
