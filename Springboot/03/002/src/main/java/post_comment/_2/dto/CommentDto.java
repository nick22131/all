package post_comment._2.dto;

import lombok.Data;

@Data
public class CommentDto {

    private Long id;
    private String name;
    private String email;
    private String body;
    private String postId;

}
