package Ecommerce._4.service;

import Ecommerce._4.payload.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
    List<OrderDto> getUserOrders(Long userId);
}
