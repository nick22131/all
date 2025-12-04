package ecommerce.springBoot_ecommerceDemo.payload;

import java.util.List;

// In package: ecommerce.springBoot_ecommerceDemo.payload (or dto)
public class OrderRequest {
    private Long customerId;
    private List<OrderItemRequest> items;
    private AddressDTO shippingAddress;
    private String paymentMethod;
    // getters/setters
}