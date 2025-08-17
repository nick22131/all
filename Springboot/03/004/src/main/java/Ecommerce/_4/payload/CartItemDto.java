package Ecommerce._4.payload;

import lombok.Data;

@Data
public class CartItemDto {
    private Long productId;
    private Integer quantity;
    private String productName;
    private Double unitePrice;

}
