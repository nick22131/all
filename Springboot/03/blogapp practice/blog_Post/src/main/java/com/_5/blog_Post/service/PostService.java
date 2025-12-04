package com._5.blog_Post.service;

import com._5.blog_Post.dto.PostDto;
import com._5.blog_Post.dto.PostResponse;

public interface PostService {

    PostDto createPost (PostDto postDto);

    PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy,String sortDir);

    PostDto getPostById(Long id)    ;

    PostDto updatePost(PostDto postDto, Long id);

    void deletePostById(Long id);
}
