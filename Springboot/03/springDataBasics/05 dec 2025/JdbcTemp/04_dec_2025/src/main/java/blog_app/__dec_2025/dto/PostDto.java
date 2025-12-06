package blog_app.__dec_2025.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min = 2, message = "must be > 2")
   private String title;

    @NotEmpty
    @Size(min = 5 , message = "must be > 5")
    private String description;

    @NotEmpty
    private String content;
}
