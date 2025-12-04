package post_comment._2.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Set<RoleDto> roles;
}
