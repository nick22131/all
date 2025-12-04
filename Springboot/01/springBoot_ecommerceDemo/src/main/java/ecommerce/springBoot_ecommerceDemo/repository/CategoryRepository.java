package ecommerce.springBoot_ecommerceDemo.repository;

import ecommerce.springBoot_ecommerceDemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {
}
