package com._5.blog_Post.service.impl;

import com._5.blog_Post.dto.PostDto;
import com._5.blog_Post.dto.PostResponse;
import com._5.blog_Post.entity.Post;
import com._5.blog_Post.exception.ResourceNotFoundException;
import com._5.blog_Post.repository.PostRepository;
import com._5.blog_Post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final ModelMapper modelMapper;
    private final PostRepository postRepository;

    // Mapping via ModelMapperBean
          // Post to PostDto
    private PostDto mapToDto(Post post){
        PostDto postDto = modelMapper.map(post, PostDto.class);
        return postDto;
    }
        // PostDto to Post
    private Post mapToEntity(PostDto postDto){
        Post post = modelMapper.map(postDto , Post.class);
        return post;
    }



    // Service Interface Implementation

    @Override
    public PostDto createPost(PostDto postDto){
        Post post = mapToEntity(postDto);
        Post newPost = postRepository.save(post);
        PostDto postDtoSaved = mapToDto(newPost);
        return postDtoSaved;
    }



    @Override
    public PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir){
        Sort sort =
                sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())  ?  Sort.by(sortBy).ascending() :  Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(pageNo, pageSize,sort);
        Page<Post>  posts = postRepository.findAll(pageable);
        List<Post> listOfPosts = posts.getContent();
        List<PostDto> content = listOfPosts.stream()
                .map((post) -> mapToDto(post))
                .collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(content);
        postResponse.setPageNo(posts.getNumber());
        postResponse.setPageSize(posts.getSize());
        postResponse.setTotalElements(posts.getTotalElements());
        postResponse.setTotalPages(posts.getTotalPages());
        postResponse.setLast(posts.isLast());

        return postResponse;
    }


    @Override
    public PostDto getPostById(Long id ){
        Post post = postRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Post", "id", id.toString()) );

        PostDto postDto = mapToDto(post);
        return postDto;
    }



    @Override
    public PostDto updatePost(PostDto postDto , Long id){
        Post post = postRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Post", "Id", id.toString()));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post updatedPost = postRepository.save(post);
        PostDto updatedPostDto = mapToDto(updatedPost);
        return updatedPostDto;
    }


    @Override
    public void deletePostById(Long id ){
        Post post = postRepository.findById(id).
                orElseThrow(()->new ResourceNotFoundException("Post", "id",id.toString()));

    }

}
