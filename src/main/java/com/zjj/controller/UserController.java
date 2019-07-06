package com.zjj.controller;

import com.zjj.model.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: znsh
 * @description: 用户控制器
 * @author: zjj
 * @create: 2019-6-4 21:15:58
 **/
@Controller
public class UserController {

    @RequestMapping("/")
    public String tologin() {
        return "login";
    }

    /** 
    * @Description: login
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: zjj
    * @Date: 2019/7/6 
    */ 
    @RequestMapping("/login")
    @ResponseBody
    public ResultData login(HttpServletRequest request, String foo, String username, String password) {
        ResultData resultData = new ResultData();
        resultData.setStatus("200");
        resultData.setMsg("登录成功");
        return resultData;
    }
}
