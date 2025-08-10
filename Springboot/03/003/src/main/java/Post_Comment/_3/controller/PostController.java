package Post_Comment._3.controller;

import Post_Comment._3.payload.PostDto;
import Post_Comment._3.payload.PostResponse;
import Post_Comment._3.service.PostService;
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
        PostDto savedPostDto = postService.createPost(postDto);
        return new ResponseEntity<>(savedPostDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<PostResponse> getAllPosts(
           @RequestParam(value = "pageNo", defaultValue ="0", required = false ) Integer pageNo,
           @RequestParam(value = "pageSize", defaultValue = "3", required = false) Integer pageSize,
           @RequestParam(value = "sortBy", defaultValue="id", required =false) String sortBy,
           @RequestParam(value = "sorDir", defaultValue="asc",required= false) String sortDir
    ){
        PostResponse postResponse = postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
        return ResponseEntity.ok().body(postResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") Long postId){
        PostDto postDto = postService.getPostById(postId);
        return ResponseEntity.ok().body(postDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto ,
                                             @PathVariable(name = "id") Long id){
        PostDto updatedPostDto = postService.updatePost(postDto,id);
        return ResponseEntity.ok().body(updatedPostDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost( @PathVariable(name = "id") Long postId){
        postService.deletePostById(postId);
        return ResponseEntity.ok().body("Deleted");
    }

}
