package com.wh.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Magic Woo
 * Date: 2019/6/4
 * Time: 13:24
 * version 1.0
 */
@Controller
@RequestMapping("view")
public class ViewController {

    @RequestMapping("hey")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
