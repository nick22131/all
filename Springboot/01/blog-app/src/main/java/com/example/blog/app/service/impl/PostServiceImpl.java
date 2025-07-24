package com.example.blog.app.service.impl;

import com.example.blog.app.entity.Post;
import com.example.blog.app.exception.ResourceNotFoundException;
import com.example.blog.app.payload.PostDto;
import com.example.blog.app.payload.PostResponse;
import com.example.blog.app.repository.PostRepository;
import com.example.blog.app.service.PostService;
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

    private final PostRepository postRepo;
    private final ModelMapper mapper;



    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapper.map(postDto, Post.class);
        Post newPost = postRepo.save(post);
        PostDto postResponse = mapper.map(newPost , PostDto.class);
        return postResponse ;
    }

    @Override
    public PostResponse getAllPosts(Integer pageNo,Integer pageSize,String sortBy,String sortDir) {
       Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
               Sort.by(sortBy).ascending():Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(pageNo, pageSize, sort   );
        Page<Post> posts = postRepo.findAll(pageable);

        List<Post> listOfPosts = posts.getContent();
        List<PostDto> content = listOfPosts.stream()
                                           .map(post -> mapper.map(post, PostDto.class))
                                           .collect(Collectors.toList());
        PostResponse postResponse = new PostResponse();
        postResponse.setContent(content);
        postResponse.setPageNo(posts.getNumber());
        postResponse.setPageSize(posts.getSize());
        postResponse.setTotalElements(posts.getTotalElements()) ;
        postResponse.setTotalPages(posts.getTotalPages());
        postResponse.setLast(posts.isLast());
        return postResponse;
    }

    @Override
    public void deletePostById(Long id) {
        Post post = postRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","id", id));
        postRepo.delete(post);
    }

    @Override
    public PostDto getPostById(Long id) {
        Post post = postRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","id",id));
        return mapper.map(post, PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
        Post post = postRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post", "id",id));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post updatePost = postRepo.save(post);
        return mapper.map(updatePost, PostDto.class);

    }
}
