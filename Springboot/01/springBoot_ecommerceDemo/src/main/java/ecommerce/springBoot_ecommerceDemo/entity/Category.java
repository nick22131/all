package ecommerce.springBoot_ecommerceDemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "catergories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id ;

   @Column(nullable = false , unique = true)
    private String name;

    @OneToMany(mappedBy = "category" , cascade =CascadeType.ALL, orphanRemoval = true)
    private Set<Product> products =  new HashSet<>();
}
