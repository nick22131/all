package ecommerce.springBoot_ecommerceDemo.payload;

import java.math.BigDecimal;
import java.util.List;

// In package: ecommerce.springBoot_ecommerceDemo.payload
public class OrderResponse {
    private Long id;
    private String customerName;
    private List<OrderItemResponse> items;
    private BigDecimal totalAmount;
    private String status;
    // getters/setters
}