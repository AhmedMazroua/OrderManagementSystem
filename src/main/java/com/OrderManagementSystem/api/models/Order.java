package com.OrderManagementSystem.api.models;

import com.OrderManagementSystem.api.services.Services;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Order extends Services {
    public Object setName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String food_Item;
    private Double amount_Spent;

    public Order(){}

    public Order(String name, String food_item, Double amount_spent) {
        this.name = name;
        this.food_Item = food_item;
        this.amount_Spent = amount_spent;
    }
}