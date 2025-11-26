package com._5.blog_Post.dto;

import lombok.Data;

import java.util.List;


@Data
public class PostResponse {
    private List<PostDto> content;
    private Integer pageNo;
    private Integer pageSize;
    private Long totalElements;
    private Integer totalPages;
    private Boolean last;
}
