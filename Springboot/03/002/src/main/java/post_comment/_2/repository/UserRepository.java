package post_comment._2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import post_comment._2.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long>     {

    Optional<User> findByUsernameorEmail(String username, String email);
    Boolean existsByUserName(String username);
    Boolean exitsByEmail(String email);

}
