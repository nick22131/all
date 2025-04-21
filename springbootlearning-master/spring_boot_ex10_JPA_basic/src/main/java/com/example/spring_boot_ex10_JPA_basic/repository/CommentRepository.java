package com.example.spring_boot_ex10_JPA_basic.repository;


import com.example.spring_boot_ex10_JPA_basic.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPostId(long postsId);
}
