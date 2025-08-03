package comment_post._3.service;

import comment_post._3.dto.PostDto;
import comment_post._3.dto.PostResponse;
import comment_post._3.entity.Post;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir);
    PostDto getPostById(Long id ) ;
    PostDto updatePost(PostDto postDto , Long id );
    void deletePostById(Long id);
}
