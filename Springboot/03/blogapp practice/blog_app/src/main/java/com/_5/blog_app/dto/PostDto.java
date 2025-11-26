package com._5.blog_app.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 3, message = "must be > 3")
    private String title;

    @NotEmpty
    @Size(min = 10 , message = "must be > 10")
    private String description;

    @NotNull
    private String content;
}
