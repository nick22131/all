package post_comment._2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import post_comment._2.model.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long>   {
    List<Comment> findByPostId(Long PostId);

}
