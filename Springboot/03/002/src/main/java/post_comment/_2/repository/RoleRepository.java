package post_comment._2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import post_comment._2.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);
}
