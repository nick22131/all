package com._5.blog_app.service;


import com._5.blog_app.dto.PostDto;
import com._5.blog_app.dto.PostResponse;
import com._5.blog_app.entity.Post;
import com._5.blog_app.repository.PostRepository;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;


      // Mappers

    private PostDto mapToDto (Post post ){
        PostDto postDto = modelMapper.map(post, PostDto.class);
        return postDto;
    }

    private Post mapToEntity(PostDto postDto){
        Post post = modelMapper.map(postDto, Post.class);
        return post;
    }



    @Override
    public PostDto createPost(PostDto postDto){
        Post post = mapToEntity(postDto);
        Post savedPost = postRepository.save(post);
        PostDto savedPostDto = mapToDto(savedPost);
        return savedPostDto;

    }


    @Override
    public PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir){
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())
                ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<Post> posts = postRepository.findAll(pageable);

        List

    }

 }
