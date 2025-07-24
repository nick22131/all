package com.example.spring_boot_ex10_JPA_basic.payload;

import lombok.Data;

@Data
public class CommentDTO {
    private long id ;
    private String name ;
    private String email;
    private String body;
}
