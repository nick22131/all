package Ecommerce._4.entity;

import jakarta.persistence.*;

public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY , targetEntity = Product.class)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Order.class)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    private Integer quantity;

    private Double price;

}
