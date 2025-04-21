package com.example.spring_boot_ex10_JPA_basic.service.imple;

import com.example.spring_boot_ex10_JPA_basic.entity.Comment;
import com.example.spring_boot_ex10_JPA_basic.entity.Post;
import com.example.spring_boot_ex10_JPA_basic.exception.BlogAPIException;
import com.example.spring_boot_ex10_JPA_basic.exception.ResourceNotFoundException;
import com.example.spring_boot_ex10_JPA_basic.payload.CommentDTO;
import com.example.spring_boot_ex10_JPA_basic.repository.CommentRepository;
import com.example.spring_boot_ex10_JPA_basic.repository.PostRepository;
import com.example.spring_boot_ex10_JPA_basic.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImple implements CommentService {

    private CommentRepository commentRepository;
    private  ModelMapper mapper;
    private PostRepository postRepository;

    public CommentServiceImple(CommentRepository commentRepository, ModelMapper mapper,PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.mapper = mapper;
        this.postRepository = postRepository;
    }

    private CommentDTO mapToDTO(Comment comment){
        CommentDTO commentDTO = mapper.map(comment, CommentDTO.class);
        return commentDTO;
    }

    private Comment mapToEntity(CommentDTO commentDTO){
        Comment comment = mapper.map(commentDTO, Comment.class);
        return comment;
    }



    @Override
    public CommentDTO createComment(long postId ,CommentDTO commentDTO){

        Comment comment = mapToEntity(commentDTO);

        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post", "id", postId )
        );
     comment.setPost(post);
     Comment newComment = commentRepository.save(comment);
     return mapToDTO(newComment);

    }

    @Override
    public List<CommentDTO> getCommentsByPostId(long postId) {
        List<Comment> comments = commentRepository.findByPostId(postId);
        return comments.stream().map(comment -> mapToDTO(comment)).collect(Collectors.toList()
        );
    }

    @Override
    public CommentDTO getCommentById(Long postId, Long commentId ){
        Post post = postRepository.findById(postId).orElseThrow (
                ()->new ResourceNotFoundException("Post", "id", commentId)
        );
        Comment comment = commentRepository.findById(commentId).orElseThrow(
                () -> new ResourceNotFoundException("Comment", "id", commentId)
        );
        if(!comment.getPost().getId().equals(post.getId())){
            throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comment does not belong to this post");
        }
        return mapToDTO(comment);

    }


}
