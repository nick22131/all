package Post_Comment._3.controller;

import Post_Comment._3.payload.CommentDto;
import Post_Comment._3.service.CommentService;
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

    @PostMapping("posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(name = "postId") Long postId,
                                                    @RequestBody CommentDto commentDto ){
        CommentDto updatedDto = commentService.createComment(postId,commentDto);
        return new ResponseEntity<>(updatedDto, HttpStatus.CREATED);
    }

    @GetMapping ("posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(@PathVariable(name="postId") Long postId){
        List<CommentDto> comments = commentService.getCommentsByPostId(postId);
        return ResponseEntity.ok().body(comments);
    }

    @GetMapping("posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> getCommentById( @PathVariable(name = "postId") Long postId,
                                                      @PathVariable(name = "commentId") Long commentId){
        CommentDto commentDto = commentService.getCommentById(postId,commentId);
        return ResponseEntity.ok().body(commentDto);
    }

    @PutMapping("posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable(name = "postId") Long postId,
                                                    @PathVariable(name = "id") Long commentId,
                                                   @RequestBody CommentDto update){
        CommentDto commentDto = commentService.updateComment(postId,commentId,update);
        return ResponseEntity.ok().body(commentDto);
    }

    @DeleteMapping("posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable(name = "postId") Long postId,
                                                @PathVariable(name ="id") Long commentID){
        commentService.deleteComment(postId,commentID);
        return ResponseEntity.ok().body("deleted");
    }


}
