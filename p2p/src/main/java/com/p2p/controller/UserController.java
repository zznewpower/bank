package com.p2p.controller;

import com.p2p.beans.User;
import com.p2p.service.UserService;
import com.p2p.until.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/print")
    public String print() {

        return "hello world";
    }

    @RequestMapping("users")
    public List<User> selectUser(int page,int size) {
        Map<String,Integer> params = new HashMap<>();
        int start = (page-1)*size;
        params.put("start",start);
        params.put("size",size);
        return userService.findAllUsers(params);
    }

    @RequestMapping("addUser")
    public int saveUser(User user){
        String pwd = SecurityUtil.addSecurity(user.getPassword());
        user.setPassword(pwd);
        int rol = userService.saveUser(user);
        return rol;
    }

    @RequestMapping("/delUser")
    public int delUser(Integer userId){
        return userService.delUserById(userId);
    }
    @RequestMapping("/delUsers")
    public int delUsers(@RequestBody ArrayList<Integer> ids){
        userService.delUserByIds(ids);
        return 1;
    }

    @RequestMapping("/modifyUser")
    public int modifyUser(User user){
        String pwd = SecurityUtil.addSecurity(user.getPassword());
        user.setPassword(pwd);
        return  userService.modifyUser(user);
    }

    @RequestMapping("findUserTol")
    public int findTol(){

        return userService.findTol();
    }

    @RequestMapping("login")
    public int login(User user, HttpSession session){
        String pwd = SecurityUtil.addSecurity(user.getPassword());
        user.setPassword(pwd);
        User user1 = userService.login(user);

        //使用shiro进行验证
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(),user.getPassword());
            subject.login(token);
            session.setAttribute("user",user1);
            return 1;
        } catch (Exception e) {
            return 0;
        }
        /*if (user1!=null){
            session.setAttribute("user",user1);
            return 1;
        }else{
            return 0;
        }*/
    }
}
