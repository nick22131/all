package com.example.blog.app.controller;

import com.example.blog.app.payload.PostDto;
import com.example.blog.app.payload.PostResponse;
import com.example.blog.app.service.PostService;
import com.example.blog.app.utili.AppConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<PostDto> createPost (@RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

    @GetMapping
    public PostResponse getAllPosts (@RequestParam (value = "pageNo",
                                                 defaultValue = AppConstants.DEFAULT_PAGE_NUMBER,
                                                 required = false) Integer pageNo,
                                     @RequestParam (value = "pageSize",
                                     defaultValue= AppConstants.DEFAULT_PAGE_SIZE,
                                     required = false)Integer pageSize,
                                     @RequestParam (value = "sortBy",
                                     defaultValue = AppConstants.DEFAULT_SORT_BY,
                                     required = false)String sortBy,
                                     @RequestParam (value = "sortDir",
                                     defaultValue = AppConstants.DEFAULT_SORT_DIRECTION,
                                     required = false)String sortDir){
        return postService.getAllPosts(pageNo,pageSize,sortBy,sortDir);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost( @PathVariable (value = "id")Long id ){
        postService.deletePostById(id) ;
        return new ResponseEntity<>("Post entity deleted succefully", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id")Long id ){
        return ResponseEntity.ok(postService.getPostById(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto ,
                                              @PathVariable(name = "id")Long id ){
        PostDto postResponse= postService.updatePost(postDto, id);
        return new ResponseEntity<>(postResponse, HttpStatus.OK );
    }

}
