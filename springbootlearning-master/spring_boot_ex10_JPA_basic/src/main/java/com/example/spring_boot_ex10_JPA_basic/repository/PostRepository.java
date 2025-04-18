package com.example.spring_boot_ex10_JPA_basic.repository;

import com.example.spring_boot_ex10_JPA_basic.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Long> {


}
