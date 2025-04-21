package com.example.spring_boot_ex10_JPA_basic.Controller;

import com.example.spring_boot_ex10_JPA_basic.payload.CommentDTO;
import com.example.spring_boot_ex10_JPA_basic.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CommentController {
    private CommentService commentService;
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }
    //http://localhost:8080/api/posts/{postId}/comments

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDTO> createComment(@PathVariable (value = "postId") long postId ,
                                                    @RequestBody CommentDTO commentDTO ){

        return new ResponseEntity<>(commentService.createComment(postId, commentDTO), HttpStatus.CREATED);
    }

    //http://localhost:8080/api/posts/{postId}/comments
    @GetMapping("/posts/{postId}/comments")
    public List<CommentDTO> getCommentsByPostId(@PathVariable Long postId){
        return commentService.getCommentsByPostId(postId);
    }

    //http://localhost:8080/api/posts/{postId}/comments/{Id}
   @GetMapping ("/posts/{postId}/comments/{Id}")
    public ResponseEntity<CommentDTO> getCommentById(@PathVariable(value = "postId")  Long postId ,
                                                     @PathVariable(value = "Id") Long commentId ){
        CommentDTO commentDTO = commentService.getCommentById(postId, commentId);
        return new ResponseEntity<>(commentDTO, HttpStatus.OK);
   }
}
