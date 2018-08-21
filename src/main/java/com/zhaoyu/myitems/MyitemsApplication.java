package com.zhaoyu.myitems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.zhaoyu.myitems.mapper")
@SpringBootApplication
@ServletComponentScan
public class MyitemsApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyitemsApplication.class, args);
        System.out.println("启动成功!");
    }
}
