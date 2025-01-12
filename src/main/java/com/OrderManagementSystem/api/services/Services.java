package com.OrderManagementSystem.api.services;

import com.OrderManagementSystem.api.models.Order;
import com.OrderManagementSystem.api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(String name,String food_Item, Double amount_Spent ){
        Order order = new Order(name, food_Item, amount_Spent);
        return orderRepository.save(order);
    }
    public Order getOrderById(long id){
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public boolean updateOrder(Long id, String name, String food_Item, Double amount_Spent){
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null){
            return true;
        }
        return false;
    }

    public boolean deleteOrder(long id){
        if (orderRepository.existsById(id)){
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}


