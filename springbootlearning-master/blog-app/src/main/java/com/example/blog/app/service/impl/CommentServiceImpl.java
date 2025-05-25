package com.example.blog.app.service.impl;

import com.example.blog.app.entity.Comment;
import com.example.blog.app.entity.Post;
import com.example.blog.app.exception.ResourceNotFoundException;
import com.example.blog.app.payload.CommentDto;
import com.example.blog.app.repository.CommentRepository;
import com.example.blog.app.repository.PostRepository;
import com.example.blog.app.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepo;
    private final PostRepository postRepo;
    private final ModelMapper mapper;


    // validating post and comment in repo
    private Comment validatePostAndComment(Long postId, Long commentId){
        Post post = postRepo.findById(postId).orElseThrow
                (()-> new ResourceNotFoundException("Post","id",postId));

        Comment comment = commentRepo.findById(commentId).orElseThrow
                (()-> new ResourceNotFoundException("Comment","id",commentId ));

        if(!comment.getPost().getId().equals(post.getId())){
            throw new ResourceNotFoundException("Comment", "id",commentId );
        }
        return comment;



    }


    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        Comment comment = mapper.map(commentDto, Comment.class);
        Post post = postRepo.findById(postId)
                .orElseThrow(()->new ResourceNotFoundException("Post","id",postId));

        comment.setPost(post);

        Comment newComment = commentRepo.save(comment);

        return mapper.map(newComment, CommentDto.class);
    }
}
