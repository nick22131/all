package ecommerce.springBoot_ecommerceDemo.repository;

import ecommerce.springBoot_ecommerceDemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // Derived Query = find orders by customer email
    List<Order> findByCustomerEmail(String email);

    //Jpql Query = find orders within date range
    @Query("SELECT o FROM Order o WHERE  o.orderDate BETWEEN :startDate AND :endDate" )
    List<Order> findByOrderDateBetween(@Param("startDate")LocalDateTime startDate ,
                                       @Param("endDate") LocalDateTime endDate);

    //Native Query = get total sale by Month
    @Query(value = "SELECT MONTH (order_date) as month, SUM (total_amount) as total"
    + "FROM orders WHERE YEAR (order_date) = :year GROUP BY MONTH(order_date)" , nativeQuery = true )
    List<Object[]> getMonthlySales(@Param("year") int year);

    //Derived Query = find order by status

}
