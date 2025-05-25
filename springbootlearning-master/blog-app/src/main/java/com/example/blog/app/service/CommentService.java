package com.example.blog.app.service;

import com.example.blog.app.payload.CommentDto;

public interface CommentService {
    CommentDto createComment (Long postId , CommentDto commentDto);

}
