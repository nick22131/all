package com.example.blog.app.controller;

import com.example.blog.app.payload.CommentDto;
import com.example.blog.app.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")

@RequiredArgsConstructor

public class CommentController {

    private final CommentService commentService;

    //Create Comment
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(name = "postId") Long postId,
                                                    @RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.createComment(postId, commentDto), HttpStatus.CREATED );
    }


// Get Comments by post ID
    @GetMapping("/posts/{postId}/comments")
    public List<CommentDto> getCommentByPostId(@PathVariable(name = "postId") Long postId){
        return commentService.getCommentsByPostId(postId);
    }


// Get comment by comment ID
    @GetMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> getCommentById(@PathVariable(name = "postId") Long postId,
                                                     @PathVariable (name = "id")Long commentId){
        CommentDto commentDto = commentService.getCommentById(postId, commentId );
        return new ResponseEntity<>(commentDto, HttpStatus.OK);
    }

    // Update Comment by postID , commentId
    @PutMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable(name= "postId") Long postId,
                                                    @PathVariable (name = "id")Long commentId ,
                                                    @RequestBody CommentDto commentDto){
        CommentDto updatedComment = commentService.updateComment(postId, commentId,commentDto);
        return new ResponseEntity<>(updatedComment, HttpStatus.OK);
    }


    // Delete Comment By PostID and CommentID
    @DeleteMapping("/posts/{postId}/commets/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable (name = "postId")Long postId,
                                                @PathVariable (name= "id")Long commentId){
        commentService.deleteComment(postId, commentId);
        return new ResponseEntity<>("comment deleted succefully", HttpStatus.OK);
    }
}
