package Post_Comment._3.payload;

import lombok.Data;

@Data
public class PostDto {

    private Long Id;
    private String title;
    private String description;
    private String content;
}
