package com.example.spring_boot_ex10_JPA_basic.Controller;


import com.example.spring_boot_ex10_JPA_basic.entity.Post;
import com.example.spring_boot_ex10_JPA_basic.payload.PostDTO;
import com.example.spring_boot_ex10_JPA_basic.payload.PostResponse;
import com.example.spring_boot_ex10_JPA_basic.service.PostService;
import com.example.spring_boot_ex10_JPA_basic.utilis.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;

    public PostController (PostService postService){
        this.postService = postService;
    }
    //http://localhost:8080/api/posts
    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO ){
        return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED);
    }

    //http
    @GetMapping
    public PostResponse getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false)int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false )String sortBy,
            @RequestParam(value = "sortDir" ,defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false)String sortDir
    ){
        return postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable(name = "id") long id ) {
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePost(@RequestBody PostDTO postDTO , @PathVariable(name= "id") long id ){
     PostDTO postResponse = postService.updatePost(postDTO , id );
     return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("post Entity deleted Successfully", HttpStatus.OK);
    }

    @GetMapping("/title/")
    ResponseEntity<List<Post>> getPostByTitle(@RequestParam(name="titl") String title){
        System.out.println("-->"+title);

        List<Post> postDto = postService.getPostByTitle(title);
        return new ResponseEntity<>(postDto, HttpStatus.OK);
    }
}
