package Ecommerce._4.payload;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private Long userId;
    private List<OrderItemDto> items;
    private String status;

}
