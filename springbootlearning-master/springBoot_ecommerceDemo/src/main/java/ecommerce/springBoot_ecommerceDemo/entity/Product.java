package ecommerce.springBoot_ecommerceDemo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="products")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(nullable = false)
    private String name ;

    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Integer stockQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "category_id")
    private Category category;
}
