package com.fruit.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date; 

@Data
@Component
public class FruitSales {
    private Long id;
    private String fruitName;
    private Integer salesVolume;
    private Date recordDate;
}
