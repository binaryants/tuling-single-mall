package com.tulingxueyuan.mall;

import cn.hutool.crypto.digest.BCrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * @Author Bin
 */
@SpringBootApplication
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
        //System.out.println(BCrypt.hashpw("123456"));
    }

}
