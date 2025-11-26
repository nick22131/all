package com._5.blog_Post.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min= 2, message = "must be  > 2")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "must be > 10")
    private String description;

    @NotEmpty
    private String content;
}
