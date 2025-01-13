package Mappers;


import com.OrderManagementSystem.api.dto.OrderDto;
import com.OrderManagementSystem.api.models.Order;

public class OrderMapper {

    // Convert Order entity to OrderDto
    public static OrderDto toDto(Order order) {
        if (order == null) {
            return null;
        }
        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setName(order.getName());
        orderDto.setFood_Item(order.getFood_Item());
        orderDto.setAmount_Spent(order.getAmount_Spent());
        return orderDto;
    }

    // Convert OrderDto to Order entity
    public static Order toEntity(OrderDto orderDto) {
        if (orderDto == null) {
            return null;
        }
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setName(orderDto.getName());
        order.setFood_Item(orderDto.getFood_Item());
        order.setAmount_Spent(orderDto.getAmount_Spent());
        return order;
    }
}
