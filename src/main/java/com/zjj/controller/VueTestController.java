package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: znsh
 * @description: 用户控制器
 * @author: zjj
 * @create: 2019-6-4 21:15:58
 **/
@Controller
public class VueTestController {

    @RequestMapping("/vue")
    public String vue() {
        return "vuetest";
    }
    @RequestMapping("/vuephone")
    public String vuephone() {
        return "vuephonetest";
    }
}
