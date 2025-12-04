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

import java.util.List;
import java.util.stream.Collectors;

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

// Create Comment
    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        Comment comment = mapper.map(commentDto, Comment.class);
        Post post = postRepo.findById(postId)
                .orElseThrow(()->new ResourceNotFoundException("Post","id",postId));

        comment.setPost(post);

        Comment newComment = commentRepo.save(comment);

        return mapper.map(newComment, CommentDto.class);
    }

    // Get Comments By post ID
    @Override
    public List<CommentDto> getCommentsByPostId(Long postId) {
        List<Comment> comments = commentRepo.findByPostId(postId);

        List<CommentDto> listComments = comments.stream()
                                                .map((commentss)-> mapper.map(commentss,CommentDto.class))
                                                 .collect(Collectors.toList());

        return listComments;
    }

// Get Comment By ID
    @Override
    public CommentDto getCommentById(Long postId, Long commentId) {
        Comment comment = validatePostAndComment(postId, commentId);
        return mapper.map(comment, CommentDto.class);
    }


    //update Comment by postId and commentId
    @Override
    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto) {
        Comment comment = validatePostAndComment(postId, commentId);
        mapper.map(commentDto,comment);
        Comment updatedComment = commentRepo.save(comment);
        return mapper.map(updatedComment, CommentDto.class);


    }

    @Override
    public void deleteComment(Long postId, Long commentId) {
        Comment comment = validatePostAndComment(postId,commentId);
        commentRepo.delete(comment);
    }
}
