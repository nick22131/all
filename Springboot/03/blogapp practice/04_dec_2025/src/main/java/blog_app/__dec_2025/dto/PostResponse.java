package blog_app.__dec_2025.dto;

import lombok.Data;
import org.hibernate.validator.constraints.ScriptAssert;

import java.util.List;

@Data
public class PostResponse {
    private List<PostDto> content;
    private Integer pageNo;
    private Integer pageSize;
    private Integer totalPages;
    private Long totalElements;
    private Boolean last;
}
