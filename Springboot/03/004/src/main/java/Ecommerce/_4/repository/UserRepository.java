package Ecommerce._4.repository;

import Ecommerce._4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {

}
