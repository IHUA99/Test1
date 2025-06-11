package com.fruit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.fruit.mapper")
@SpringBootApplication
public class FruitSalesTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitSalesTestApplication.class, args);
    }

}
