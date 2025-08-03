package comment_post._3.controller;

import comment_post._3.dto.PostDto;
import comment_post._3.dto.PostResponse;
import comment_post._3.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor

public class PostController {
    private final PostService postService;


    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto postDto1 = postService.createPost(postDto);
        return new ResponseEntity<>(postDto1, HttpStatus.CREATED);
    }



    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable (name = "id ") Long id){
        PostDto gotPostDto = postService.getPostById(id);
        return new ResponseEntity<>(gotPostDto,HttpStatus.OK);
    }




    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(Long id ){
        postService.deletePostById(id);
        return ResponseEntity.ok().body("deleted");
    }




    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(
            @PathVariable(name = "id") Long id,
           @RequestBody PostDto postDto
    ){
        PostDto updatedPostDto = postService.updatePost(postDto,id);
        return ResponseEntity.ok().body(updatedPostDto);
    }




    @GetMapping
    public ResponseEntity<PostResponse> getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = "0" , required = false) Integer pageNo,
            @RequestParam(value = "pageSize" , defaultValue = "10" , required = false) Integer pageSize,
            @RequestParam(value = "sortBy" , defaultValue = "id", required = false  ) String sortBy,

            @RequestParam(value = "sortDir", defaultValue = "asc" , required = false)  String sortDir
    ){
        PostResponse gotResponse = postService.getAllPosts(pageNo,pageSize,sortBy,sortDir);
        return ResponseEntity.ok().body(gotResponse);
    }

}
