package com.wh.springboothello01.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * User: Magic Woo
 * Date: 2019/6/3
 * Time: 17:05
 * version 1.0
 */
@Component
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener destroyed++++++");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener init+++++++++++");
    }
}
