package Post_Comment._3.service.serviceImpl;

import Post_Comment._3.exception.ResourceNotFoundException;
import Post_Comment._3.model.Post;
import Post_Comment._3.payload.PostDto;
import Post_Comment._3.payload.PostResponse;
import Post_Comment._3.repository.PostRepository;
import Post_Comment._3.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService  {

    private PostRepository postRepository ;
    private ModelMapper modelMapper;

    private PostDto mapToDto(Post post){
        return modelMapper.map(post, PostDto.class);
    }

    private Post mapToEntity(PostDto postDto){
        return modelMapper.map(postDto, Post.class);
    }


   // Create Post
    @Override
    public PostDto createPost(PostDto postDto ){

        Post post = mapToEntity(postDto);
        Post savedPost = postRepository.save(post);
        PostDto savedPostDto = mapToDto(savedPost);
        return savedPostDto;
    }

    // Get post by Id
    @Override
    public PostDto getPostById(Long postId){
        Post post = postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post", "PostId", postId.toString()));

        PostDto postDto = mapToDto(post);
        return postDto;
    }

    // update Post
    @Override
    public PostDto updatePost(PostDto postDto,Long postId){
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post", "postId", postId.toString()) );
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post updatedPost = postRepository.save(post);
        PostDto updatedPostDto = mapToDto(updatedPost);
        return updatedPostDto;
    }

    //Delete post
    public void deletePostById(Long postId){
        Post post = postRepository.findById(postId).
                orElseThrow(()-> new ResourceNotFoundException("Post", "postId", postId.toString()));
        postRepository.delete(post);
    }

    @Override
    public PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir ){
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())  ?
                Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        Page<Post> posts = postRepository.findAll(pageable);
        List<Post> listOfPosts = posts.getContent();
        List<PostDto> content = listOfPosts
                .stream()
                .map((post)-> mapToDto(post) )
                .collect(Collectors.toList());
        PostResponse postResponse  = new PostResponse();
        postResponse.setContent(content);
        postResponse.setPageNo(posts.getNumber());
        postResponse.setPageSize(posts.getSize());
        postResponse.setTotalElements(posts.getTotalElements());
        postResponse.setTotalPages(posts.getTotalPages());
        postResponse.setLast(posts.isLast());

        return postResponse;
    }



}
