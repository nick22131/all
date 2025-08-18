package Ecommerce._4.service;


import Ecommerce._4.payload.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser (UserDto userDto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long id , UserDto userDto);
    void deleteUser(Long id);
    List<UserDto> createUsers(List<UserDto> userDtos);

}
