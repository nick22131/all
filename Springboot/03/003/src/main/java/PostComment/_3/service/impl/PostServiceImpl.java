package PostComment._3.service.impl;

import PostComment._3.dto.PostDto;
import PostComment._3.dto.PostResponse;
import PostComment._3.entity.Post;
import PostComment._3.repository.PostRepository;
import PostComment._3.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Override
    public PostDto createPost(PostDto postDto){
        Post post = mapToEntity(postDto);
        Post newPost = postRepository.save(post);
        return mapToDto(newPost);
    }

    @Override
    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir){
        Sort sort = sorDir.w
    }


    private Post mapToEntity(PostDto postDto){
        return modelMapper.map(postDto, Post.class);
    }

    private PostDto mapToDto(Post post){
        return modelMapper.map(post, PostDto.class);
    }

}
