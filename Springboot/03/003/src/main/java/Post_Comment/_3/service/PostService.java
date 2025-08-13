package Post_Comment._3.service;

import Post_Comment._3.payload.PostDto;
import Post_Comment._3.payload.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir);

    PostDto getPostById(Long id);

    PostDto getPostByTitle(String title);

    PostDto updatePost(PostDto postDto, Long id);

    void deletePostById(Long Id );
}
