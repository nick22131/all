package ecommerce.springBoot_ecommerceDemo.repository;

import ecommerce.springBoot_ecommerceDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long>{
    //Derived Query = find products by category name
    List<Product> findByCategoryName(String categoryName);

    // JPQL Query = find products within price range
    @Query ( "SELECT p FROM Product p WHERE p.price BETWEEN minPrice AND :maxPrice")
    List<Product> findByPriceRange (@Param("minPrice") double minPrice ,
                                     @Param("maxPrice") double maxPrice);

    // Native Query = search products by name or description
    @Query(value = "SELECT * FROM products p WHERE  p.name LIKE %keyword% OR p.description LIKE %:keyword%" ,
    nativeQuery = true)
    List<Product> searchProducts(@Param("keyword") String keyword) ;

    //Derived Query = find products with stock less than specified quantity
    List<Product> findByStockQuantityLessThan(Integer quantity);

}
