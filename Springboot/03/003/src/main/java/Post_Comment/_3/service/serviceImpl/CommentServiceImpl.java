package Post_Comment._3.service.serviceImpl;

import Post_Comment._3.exception.ResourceNotFoundException;
import Post_Comment._3.model.Comment;
import Post_Comment._3.model.Post;
import Post_Comment._3.payload.CommentDto;
import Post_Comment._3.repository.CommentRepository;
import Post_Comment._3.repository.PostRepository;
import Post_Comment._3.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    private CommentDto mapToDto(Comment comment){
            return modelMapper.map(comment , CommentDto.class);
    }

    private Comment mapToEntity(CommentDto commentDto){
        return modelMapper.map(commentDto, Comment.class);
    }


    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {

        Comment comment = mapToEntity(commentDto);
         Post post = postRepository.findById(postId)
                 .orElseThrow(()->new ResourceNotFoundException("Post", "postID", postId.toString()));

         comment.setPost(post);
         Comment savedComment = commentRepository.save(comment);
         CommentDto savedCommentDto = mapToDto(savedComment);
         return savedCommentDto;
    }


    @Override
    public List<CommentDto> getCommentsByPostId(Long postId){
        List<Comment> comments = commentRepository.findByPostId(postId);
        List<CommentDto> commentDtos = comments
                .stream()
                .map((comment)-> mapToDto(comment))
                .collect(Collectors.toList());
        return commentDtos;

    }

    @Override
    public CommentDto getCommentById(Long commentId, Long postId){
        Post post = postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post", "postId", postId.toString()));
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment", "CommentId", commentId.toString()));
        if(!comment.getPost().getId().equals(post.getId())){
            throw new ResourceNotFoundException("Comment","id", commentId.toString());
        }
        CommentDto commentDto = mapToDto(comment);
        return commentDto;
    }

    @Override
    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto){
        Post post = postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","PostId", postId.toString()));
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment", "commentID", commentId.toString()));
        if(!comment.getPost().getId().equals(post.getId())){
            throw new ResourceNotFoundException("Comment", "commentId", commentId.toString());
        }
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());
        Comment updatedComment = commentRepository.save(comment);
        CommentDto updatedCommentDto = mapToDto(updatedComment  );
        return updatedCommentDto;
    }


    @Override
    public void deleteComment(Long postId, Long commentId){
        Post post = postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post", "PostId",postId.toString()));
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment","commentId",commentId.toString()));
        if(!comment.getPost().getId().equals(post.getId())){
            throw new ResourceNotFoundException("Comment","commentId",commentId.toString());
        }
    }
}
