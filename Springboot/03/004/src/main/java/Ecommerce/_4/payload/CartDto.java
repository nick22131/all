package Ecommerce._4.payload;

import lombok.Data;

import java.util.List;

@Data
public class CartDto {

    private Long id;
    private List<UserDto> userDtos;

}
