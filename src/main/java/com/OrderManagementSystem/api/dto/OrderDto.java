package com.OrderManagementSystem.api.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
    private Long id;
    private String name;
    private String food_Item;
    private Double amount_Spent;
}

