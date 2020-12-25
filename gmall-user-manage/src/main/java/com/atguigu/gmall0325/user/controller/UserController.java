package com.atguigu.gmall0325.user.controller;

import com.atguigu.gmall0325.bean.UserInfo;
import com.atguigu.gmall0325.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
return userService.findAll();
    }
}
