package com._5.blog_Post.controller;

import com._5.blog_Post.dto.PostDto;
import com._5.blog_Post.dto.PostResponse;
import com._5.blog_Post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posts")
@RequiredArgsConstructor
public class PostController {


    private final PostService postService;

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto savedPostDto = postService.createPost(postDto);
        return new ResponseEntity<>(savedPostDto, HttpStatus.CREATED);
    }




    @GetMapping
    public ResponseEntity<PostResponse> getAllPosts(
          @RequestParam(value = "pageNo", defaultValue = "0", required = false)  Integer pageNo,
          @RequestParam(value = "pageSize", defaultValue = "3", required = false)  Integer pageSize,
          @RequestParam(value = "sortBy" , defaultValue = "id", required = false) String sortBy,
          @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir
    ){
        PostResponse postResponse = postService.getAllPosts(pageNo,pageSize,sortBy,sortDir);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }




    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById( @PathVariable Long id ){
        PostDto postDto = postService.getPostById(id);
        return ResponseEntity.ok(postDto);
    }




    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(
           @RequestBody PostDto postDto,
           @PathVariable(value = "id") Long id
    ){
        PostDto updatedPostDto = postService.updatePost(postDto, id);
        return ResponseEntity.ok(updatedPostDto);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost( @PathVariable(value = "id") Long id ){
        postService.deletePostById(id);
        return ResponseEntity.ok("Post Deleted");
    }

}
