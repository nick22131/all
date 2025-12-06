package blog_app.__dec_2025.service;

import blog_app.__dec_2025.dto.PostDto;
import blog_app.__dec_2025.dto.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto) ;

    PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir);

    PostDto getPostById(Long id);

    PostDto updatePost (PostDto postDto, Long id);

    void deletePost(Long id);
}
