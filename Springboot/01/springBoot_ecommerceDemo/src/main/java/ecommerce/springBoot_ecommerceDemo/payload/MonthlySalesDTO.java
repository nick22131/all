package ecommerce.springBoot_ecommerceDemo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlySalesDTO {
    private Integer month;
    private BigDecimal total;
}
