package com.example.spring_boot_ex10_JPA_basic.service;

import com.example.spring_boot_ex10_JPA_basic.entity.Post;
import com.example.spring_boot_ex10_JPA_basic.payload.PostDTO;
import com.example.spring_boot_ex10_JPA_basic.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO createPost (PostDTO postDTO);

    PostResponse getAllPosts(int pageNo , int pageSize, String sortBy, String sortDir);

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id );

    void deletePostById(long id);

    List<Post> getPostByTitle(String title);



}
