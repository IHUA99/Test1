package com.fruit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fruit.entity.FruitSales;
import com.fruit.mapper.FruitSalesMapper;
import com.fruit.service.FruitSalesService;
import org.springframework.stereotype.Service;

@Service
public class FruitSalesServiceImpl extends ServiceImpl<FruitSalesMapper, FruitSales> implements FruitSalesService{
}
