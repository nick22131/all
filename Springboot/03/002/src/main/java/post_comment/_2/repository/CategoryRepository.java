package post_comment._2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import post_comment._2.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>  {

}
