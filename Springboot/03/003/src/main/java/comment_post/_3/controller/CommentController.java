package comment_post._3.controller;

import comment_post._3.payload.CommentDto;
import comment_post._3.service.CommentService;
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


    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value= "postId") Long postId,
                                                    @RequestBody CommentDto commentDto ){
        CommentDto savedCommentDto = commentService.createComment(postId,commentDto);
        return new ResponseEntity<>(savedCommentDto, HttpStatus.CREATED);
    }



    @GetMapping("/posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(@PathVariable (value = "postId") Long postId){
        List<CommentDto> comments = commentService.getCommentsByPostId(postId);
        return ResponseEntity.ok().body(comments);
    }




    @GetMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> getCommentById(@PathVariable(value = "postId") Long postId,
                                                     @PathVariable (value = "id") Long commentId){
        CommentDto commentDto = commentService.getCommentById(postId,commentId);
        return ResponseEntity.ok().body(commentDto);
    }



    @PutMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable(value = "postId") Long postId,
                                                    @PathVariable(value="id") Long commentId,
                                                    @RequestBody CommentDto commentDto){
        CommentDto updatedCommentDto = commentService.updateComment(postId, commentId,commentDto);
        return ResponseEntity.ok().body(updatedCommentDto);
    }


    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable(value="postId") Long postId,
                                                @PathVariable(value ="id") Long commentId){
        commentService.deleteComment(postId,commentId);
        return new ResponseEntity<>("DELETED",HttpStatus.OK);
    }

}
