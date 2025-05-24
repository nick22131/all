package com.example.blog.app.service.impl;

import com.example.blog.app.entity.Post;
import com.example.blog.app.payload.PostDto;
import com.example.blog.app.repository.PostRepository;
import com.example.blog.app.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private PostRepository postRepo;
    private ModelMapper mapper;



    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapper.map(postDto, Post.class);
        Post newPost = postRepo.save(post);
        PostDto postResponse = mapper.map(newPost , PostDto.class);
        return postResponse ;
    }
}
