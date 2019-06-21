package com.github.ixiongdi.di;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.ixiongdi.di.wiki.mapper")
public class DiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }

}
