package com.fruit.controller;

import com.fruit.entity.FruitSales;
import com.fruit.service.FruitSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitSalesController {

    @Autowired
    private FruitSalesService fruitSalesService;

    @GetMapping("/list")
    public List<FruitSales> list() {
        return fruitSalesService.list();
    }
}
