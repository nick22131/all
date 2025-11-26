package com._5.blog_app.service;

import com._5.blog_app.dto.PostDto;
import com._5.blog_app.dto.PostResponse;
import org.springframework.stereotype.Service;


public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy,String sortDir );

    PostDto getPostById(Long id);

    PostDto updatePost(PostDto postDto , Long id);

    void deletePost(Long id);


}
