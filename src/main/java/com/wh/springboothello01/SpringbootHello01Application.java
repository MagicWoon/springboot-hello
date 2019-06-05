package com.wh.springboothello01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wh.springboothello01.mapper")
public class SpringbootHello01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHello01Application.class, args);
    }

}
