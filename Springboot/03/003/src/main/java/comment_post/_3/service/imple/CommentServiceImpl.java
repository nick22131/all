package comment_post._3.service.imple;

import comment_post._3.entity.Comment;
import comment_post._3.entity.Post;
import comment_post._3.exception.ResourceNotFoundException;
import comment_post._3.payload.CommentDto;
import comment_post._3.repository.CommentRepository;
import comment_post._3.repository.PostRepository;
import comment_post._3.service.CommentService;
import comment_post._3.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository ;
    private final Mapper mapper;

    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto){
        Comment comment = mapper.mapToCommentEntity(commentDto);
        Post post = postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post", "id", postId.toString()));

        comment.setPost(post);
        Comment savedComment = commentRepository.save(comment);
        CommentDto savedDto = mapper.mapToCommentDto(savedComment);
        return savedDto;

    }


    @Override
    public CommentDto getCommentById(Long postId, Long commentId){
        Post post = postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","postId",postId.toString()));

        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment","commentId",commentId.toString()));


        if(!comment.getPost().getId().equals(post.getId())){
            throw new ResourceNotFoundException("Comment", "commentId", commentId.toString());
        }

        CommentDto commentDto = mapper.mapToCommentDto(comment);
        return commentDto;
    }

    @Override
    public List<CommentDto> getCommentsByPostId(Long postId){
        List<Comment> comments = commentRepository.findByPostId(postId);
        List<CommentDto> commentDtos = comments
                                          .stream()
                                           .map((comment) -> mapper.mapToCommentDto(comment))
                                             .collect(Collectors.toList());
        return commentDtos;
    }


    @Override
    public CommentDto updateComment(Long postId , Long commentId, CommentDto commentDto){

        Post post = postRepository.findById(postId)
                              .orElseThrow(()-> new ResourceNotFoundException("Post","Id", postId.toString()));

        Comment comment = commentRepository.findById(commentId)
                               .orElseThrow(()->new ResourceNotFoundException("Comment", "ID",commentId.toString()));

        if(!comment.getPost().getId().equals(post.getId())){
            throw new ResourceNotFoundException("Comments","Id",commentId.toString());
        }

        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());

        Comment updatedComment = commentRepository.save(comment);
        CommentDto updatedCommentDto = mapper.mapToCommentDto(updatedComment);
        return updatedCommentDto;

    }

    @Override
    public void deleteComment(Long postId , Long commentId){


    }



}
