package PostComment._3.service;

import PostComment._3.dto.PostDto;
import PostComment._3.dto.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id );
    void deletePostById(long id);
}
