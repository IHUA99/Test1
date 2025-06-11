package com.fruit;

import com.fruit.entity.FruitSales;
import com.fruit.mapper.FruitSalesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FruitSalesTestApplicationTests {
    @Autowired
    private FruitSalesMapper fruitSalesMapper;

    @Test
    void contextLoads() {
        List<FruitSales> list = fruitSalesMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
