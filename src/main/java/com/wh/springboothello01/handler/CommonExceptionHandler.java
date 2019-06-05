package com.wh.springboothello01.handler;

import com.wh.springboothello01.pojo.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Magic Woo
 * Date: 2019/6/4
 * Time: 10:57
 * version 1.0
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handleException(Exception e){
        return new ResultBean("500",e.getMessage());
//        return new ResultBean("404","服务器繁忙,请稍后再试");
    }

}
