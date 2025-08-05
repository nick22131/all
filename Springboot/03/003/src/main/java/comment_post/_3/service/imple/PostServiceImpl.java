package comment_post._3.service.imple;

import comment_post._3.payload.PostDto;
import comment_post._3.payload.PostResponse;
import comment_post._3.entity.Post;
import comment_post._3.exception.ResourceNotFoundException;
import comment_post._3.repository.PostRepository;
import comment_post._3.service.PostService;
import comment_post._3.util.Mapper;
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
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    private final Mapper mapper;




    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapper.mapToPostEntity(postDto);
        Post savedPost = postRepository.save(post);
        PostDto savedPostDto =  mapper.mapToPostDto(savedPost);
        return savedPostDto ;
    }



    @Override
    public PostDto getPostById(Long id){
        Post post = postRepository.findById(id )
                .orElseThrow(() -> new ResourceNotFoundException("Post","id", id.toString()));
        PostDto postDto = mapper.mapToPostDto(post);
        return postDto;
    }

    @Override
    public PostDto updatePost(PostDto postDto, Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Post", "id",id.toString() ));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent()    );
        Post updatedPost = postRepository.save(post);
        PostDto updatedPostDto = mapper.mapToPostDto(updatedPost);
        return updatedPostDto ;
    }

    @Override
    public void deletePostById(Long id ){
        Post post = postRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id", id.toString()));
        postRepository.delete(post);
    }

    @Override
    public PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
                Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<Post> posts = postRepository.findAll(pageable);
        List<Post> listOfPosts = posts.getContent();
        List<PostDto> content = listOfPosts
                .stream()
                .map((post)-> mapper.mapToPostDto(post) )
                .collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(content);
        postResponse.setPageNo(posts.getNumber());
        postResponse.setPageSize(posts.getSize());
        postResponse.setTotalElements(posts.getTotalElements());
        postResponse.setTotalPages(posts.getTotalPages());
        postResponse.setLast(posts.isLast());
        return postResponse;
    }





}
