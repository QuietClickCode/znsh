package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: xdtest之表格组价
 * @description: 测试xd表格组件
 * @author: zjj
 * @create: 2019年5月22日21:22:47
 **/
@Controller
public class TestController {


    @RequestMapping("/test")
    public String article() {
        return "test";
    }
    @RequestMapping("/demo")
    public String demo() {
        return "demo";
    }
}
