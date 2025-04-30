package ecommerce.springBoot_ecommerceDemo.repository;

import ecommerce.springBoot_ecommerceDemo.entity.Customer;
import ecommerce.springBoot_ecommerceDemo.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    Optional<ShoppingCart> findByCustomer(Customer customer);

    // Option 2: Find by customer ID (often more efficient)
    Optional<ShoppingCart> findByCustomerId(Long customerId);

    // Option 3: Using JPA query
    @Query("SELECT sc FROM ShoppingCart sc WHERE sc.customer.id = :customerId")
    Optional<ShoppingCart> findCartByCustomer(@Param("customerId") Long customerId);
}