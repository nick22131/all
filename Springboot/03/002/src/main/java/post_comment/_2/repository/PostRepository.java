package post_comment._2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import post_comment._2.model.Post;

public interface PostRepository extends JpaRepository<Post,Long>  {

}
