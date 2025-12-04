package blog_app.__dec_2025.controller;

import blog_app.__dec_2025.dto.PostDto;
import blog_app.__dec_2025.dto.PostResponse;
import blog_app.__dec_2025.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService   ;

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
       PostDto postDtoSaved = postService.createPost(postDto);
       return new ResponseEntity<>(postDtoSaved, HttpStatus.CREATED     );
    }



    @GetMapping
    public ResponseEntity<PostResponse> getAllPosts(
        @RequestParam(value = "pageNo", defaultValue = "0", required = false)   Integer pageNo,
        @RequestParam (value = "pageSize", defaultValue = "2", required = false) Integer pageSize,
        @RequestParam(value = "sortBy", defaultValue = "id", required = false) String sortBy,
        @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir
    ){
        PostResponse postResponse = postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
        return new ResponseEntity<>(postResponse,HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(
            @PathVariable(value = "id") Long id){
        PostDto postDto = postService.getPostById(id);
        return ResponseEntity.ok(postDto);
    }


    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePostById(
           @RequestBody PostDto postDto,
           @PathVariable(value = "id")  Long id
    ){
        PostDto postDtoUpdated = postService.updatePost(postDto,id);
        return ResponseEntity.ok(postDtoUpdated);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<String> deletePost( @PathVariable(value = "Id") Long id){
        postService.deletePost(id);
        return ResponseEntity.ok("Deleted");
    }


}
