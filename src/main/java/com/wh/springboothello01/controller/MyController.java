package com.wh.springboothello01.controller;

import com.wh.springboothello01.entity.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Magic Woo
 * Date: 2019/6/3
 * Time: 12:01
 * version 1.0
 */
@Controller
@RequestMapping("my")
@Slf4j
public class MyController {

    @Value("${image.server}")
    private String imageServer;

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello springboot!!!"+imageServer;
    }

    @ResponseBody
    @RequestMapping("getdate")
    public Date getDate(Date date){
        log.info(date.toString());
        return date;
    }

    @ResponseBody
    @RequestMapping("msg")
    public String getMsg(@Valid  Teacher teacher){
        return teacher.toString();
    }

}
