package Ecommerce._4.repository;

import Ecommerce._4.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long >  {
}
