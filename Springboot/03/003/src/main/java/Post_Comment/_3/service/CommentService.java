package Post_Comment._3.service;

import Post_Comment._3.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(Long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(Long postId);

    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, Long CommentId, CommentDto commentDto);

    void deleteComment(Long post, Long commentId);
}
