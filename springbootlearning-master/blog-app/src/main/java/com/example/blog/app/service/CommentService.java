package com.example.blog.app.service;

import com.example.blog.app.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment (Long postId , CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(Long postId);

    CommentDto getCommentById (Long postId, Long commentId);

    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto);


    void deleteComment(Long postId, Long commentId);
}
