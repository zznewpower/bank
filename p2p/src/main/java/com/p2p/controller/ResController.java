package com.p2p.controller;

import com.p2p.beans.Res;
import com.p2p.beans.User;
import com.p2p.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@RestController
public class ResController {
    @Autowired
    private ResService resService;


    @RequestMapping("findAllRes")
    public List<Res> findRoles(){
        return resService.findRes();
    }

    @RequestMapping("saveRoleResource")
    @Transactional
    public int saveRoleResource(@RequestBody ArrayList<Integer> arr){
        int rid = arr.get(0);
        arr.remove(0);
        Map<String,Object> map = new HashMap<>();
        map.put("rid",rid);
        map.put("arr",arr);
        resService.delRoleResource(rid);
        return resService.saveRoleResource(map);
    }

    @RequestMapping("findAllRoleRes")
    public List<Res> findRoleRes(HttpSession session){
        User u = (User)session.getAttribute("user");
        int uid = u.getUserId();
        return resService.findRoleRes(uid);
    }
}
