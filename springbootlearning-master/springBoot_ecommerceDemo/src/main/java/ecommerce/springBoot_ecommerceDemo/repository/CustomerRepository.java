package ecommerce.springBoot_ecommerceDemo.repository;

import ecommerce.springBoot_ecommerceDemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

   //Derived Query = find customer by id
    Optional<Customer> findByEmail(String email);

    // jpql query = find customers who spent more than specified amount
    @Query("SELECT c FROM Customer c WHERE" +
    "(SELECT SUM(o.totalAmount) FROM Order o WHERE o.customer = c ) > : amount")
    List<Customer> findTopSpenders(@Param("amount") double amount);

    // Native Query = count customers by City
    @Query(value = "SELECT address_city as city, COUNT(*) as count FROM customers GROUP BY address_city",
    nativeQuery = true)
    List<Object[]> countCustomersByCity();

}
