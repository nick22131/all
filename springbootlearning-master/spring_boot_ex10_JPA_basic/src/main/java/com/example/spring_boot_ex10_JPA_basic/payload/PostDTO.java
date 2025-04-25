package com.example.spring_boot_ex10_JPA_basic.payload;


import lombok.Data;

import java.util.Set;

@Data
public class PostDTO {
    private long id ;
    private String title ;
    private String description ;
    private String content;
    private Set<CommentDTO> comments;
}
