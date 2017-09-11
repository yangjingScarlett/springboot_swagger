package com.yang.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Swagger2learnApplication {

    public static void main(String[] args) {
        //通过访问地址http://localhost:8080/swagger-ui.html/查看生成好的API
        SpringApplication.run(Swagger2learnApplication.class, args);
    }
}
