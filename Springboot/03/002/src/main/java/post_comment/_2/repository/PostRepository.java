package post_comment._2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import post_comment._2.model.Post;

import java.awt.print.Pageable;

public interface PostRepository extends JpaRepository<Post,Long>  {
    Page<Post> findByCategoryId(Long categoryId, Pageable pageable);
    Page<Post> findByUserId(Long userId , Pageable pageable);


}
