package ecommerce.springBoot_ecommerceDemo.payload;



import java.math.BigDecimal;

public class OrderItemResponse {
    private Long productId;
    private String productName;
    private String productImageUrl;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal subTotal;

    // Constructors
    public OrderItemResponse() {}

    public OrderItemResponse(Long productId, String productName, String productImageUrl,
                             Integer quantity, BigDecimal unitPrice, BigDecimal subTotal) {
        this.productId = productId;
        this.productName = productName;
        this.productImageUrl = productImageUrl;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
    }

    // Getters and Setters
    public Long getProductId() {
        return productId;
    }
    // ... other getters/setters
}