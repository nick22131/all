package com.example.blog.app.repository;

import com.example.blog.app.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long > {
}
