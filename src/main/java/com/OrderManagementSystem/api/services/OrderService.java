package com.OrderManagementSystem.api.services;

import com.OrderManagementSystem.api.dto.OrderDto;
import com.OrderManagementSystem.api.mappers.OrderMapper;
import com.OrderManagementSystem.api.models.Order;
import com.OrderManagementSystem.api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderDto createOrder(OrderDto orderDto){
        Order order = OrderMapper.toEntity(orderDto);
        order = orderRepository.save(order);
        return OrderMapper.toDto(order);
    }
    public OrderDto getOrderById(long id){
        return orderRepository.findById(id)
                .map(OrderMapper::toDto)
                .orElse(null);
    }

    public List<OrderDto> getAllOrders(){
        return orderRepository.findAll().stream()
                .map(OrderMapper::toDto)
                .collect(Collectors.toList());
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