package com.wh.springboothello01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User: Magic Woo
 * Date: 2019/6/4
 * Time: 10:53
 * version 1.0
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {
    private String respCode;
    private T Data;
}
