package com.p2p.controller;

import com.p2p.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/11/7.
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("login")
    public int login(){

        return 0;
    }
}
