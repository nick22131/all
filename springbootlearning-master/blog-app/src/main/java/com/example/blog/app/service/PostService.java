package com.example.blog.app.service;

import com.example.blog.app.payload.PostDto;
import com.example.blog.app.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(Integer pageNo,Integer pageSize,String sortBy,String sortDir);

    void deletePostById(Long id);

    PostDto getPostById(Long id);

    PostDto updatePost(PostDto postDto, long id);


}
