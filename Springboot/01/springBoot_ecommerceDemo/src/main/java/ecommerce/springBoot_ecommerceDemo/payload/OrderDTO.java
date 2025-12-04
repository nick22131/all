package ecommerce.springBoot_ecommerceDemo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id ;
    private String customerEmail;
    private List<OrderItemDTO> items;
    private BigDecimal totalAmount;

    private LocalDateTime orderDate;



}
