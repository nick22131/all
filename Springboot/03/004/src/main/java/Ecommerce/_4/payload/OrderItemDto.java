package Ecommerce._4.payload;

import lombok.Data;

@Data
public class OrderItemDto {

    private Long productId;
    private Integer quantity;
    private Double price;

}
