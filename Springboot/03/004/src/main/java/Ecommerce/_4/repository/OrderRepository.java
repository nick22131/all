package Ecommerce._4.repository;

import Ecommerce._4.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT o.* FROM orders o " +
            "JOIN order_item oi ON o.id = oi.order_id " +
            "WHERE o.user_id = :userId",
            nativeQuery = true)
    List<Order> findOrdersWithItemsByUser(@Param("userId") Long userId);

    @Query(value = "SELECT p.name, oi.quantity, oi.price " +
            "FROM order_item oi " +
            "JOIN product p ON oi.product_id = p.id " +
            "WHERE oi.order_id = :orderId",
            nativeQuery = true)
    List<Object[]> findOrderDetails(@Param("orderId") Long orderId);
}