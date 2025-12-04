package com.example.spring_boot_ex10_JPA_basic.service.imple;

import com.example.spring_boot_ex10_JPA_basic.entity.Post;
import com.example.spring_boot_ex10_JPA_basic.exception.ResourceNotFoundException;
import com.example.spring_boot_ex10_JPA_basic.payload.PostDTO;
import com.example.spring_boot_ex10_JPA_basic.payload.PostResponse;
import com.example.spring_boot_ex10_JPA_basic.repository.PostRepository;
import com.example.spring_boot_ex10_JPA_basic.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImple implements PostService {

    private final PostRepository pstRepo;
    private final ModelMapper mapper;

    public PostServiceImple (PostRepository pstRepo, ModelMapper mapper) {
        this.mapper = mapper;
        this.pstRepo = pstRepo;
    }

    // convert Entity into DTO
    private PostDTO mapToDTO(Post post){
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());
        return postDTO;
    }
    // convert DTO to Entity
    private Post mapToEntity(PostDTO postDTO){
        Post post = new Post();
        post.setTitle (postDTO.getTitle ());
        post.setDescription (postDTO.getDescription());
        post.setContent(postDTO.getContent());
        return post;
    }




    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // Convert DTO to Entity
        Post post = mapToEntity(postDTO);
        Post newPost = pstRepo.save(post); // this saves post in database

        PostDTO postResponse = mapToDTO(newPost);
       return postResponse;


    }

    @Override
    public PostResponse getAllPosts (int pageNo, int pageSize, String sortBy,String sortDir){
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
                Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        org.springframework.data.domain.Pageable pageable = PageRequest.of(pageNo,pageSize, sort);
        Page<Post> posts = pstRepo.findAll((org.springframework.data.domain.Pageable) pageable);
        List<Post> listofPosts = posts.getContent();

        List<PostDTO>content = listofPosts.stream()
                .map(post -> mapToDTO(post))
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


   @Override
    public PostDTO getPostById(long id){
        Post post = pstRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id ));
        return mapToDTO(post);
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO, long id ){
        Post post = pstRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        Post updatePost = pstRepo.save(post);
        return mapToDTO(updatePost);
    }

   @Override
    public void deletePostById(long id){
        // get post by id from the database
       Post post = pstRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id", id ));
       pstRepo.delete(post);

   }

    @Override
    public List<Post> getPostByTitle(String title) {
       List<Post> post = pstRepo.findByTitle(title);
       return post;
    }

}
