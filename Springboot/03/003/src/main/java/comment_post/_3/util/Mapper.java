package comment_post._3.util;

import comment_post._3.entity.Comment;
import comment_post._3.entity.Post;
import comment_post._3.payload.CommentDto;
import comment_post._3.payload.PostDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Mapper {

    private final ModelMapper modelMapper; // Changed from AppConfig to ModelMapper

    public CommentDto mapToCommentDto(Comment comment) {
        return modelMapper.map(comment, CommentDto.class); // Fixed syntax error
    }

    public Comment mapToCommentEntity(CommentDto commentDto) {
        return modelMapper.map(commentDto, Comment.class);
    }

    public Post mapToPostEntity(PostDto postDto) {
        return modelMapper.map(postDto, Post.class);
    }

    public PostDto mapToPostDto(Post post) {
        return modelMapper.map(post, PostDto.class);
    }
}