package com.example.spring_boot_ex10_JPA_basic.service;

import com.example.spring_boot_ex10_JPA_basic.entity.Comment;
import com.example.spring_boot_ex10_JPA_basic.payload.CommentDTO;
import org.modelmapper.ModelMapper;

import java.util.List;


public interface CommentService {


    public CommentDTO createComment(long postId , CommentDTO commentDTO);
    public List<CommentDTO> getCommentsByPostId(long postId);
    public CommentDTO getCommentById(Long postId, Long commentId);
    public CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentRequest);
    void deleteComment(Long postId , Long commentId);
}
