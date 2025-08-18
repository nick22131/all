package Ecommerce._4.service.serviceIMPL;

import Ecommerce._4.entity.User;
import Ecommerce._4.exception.ResourceNotFoundException;
import Ecommerce._4.payload.UserDto;
import Ecommerce._4.repository.UserRepository;
import Ecommerce._4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = modelMapper.map(userDto, User.class);
        User savedUser = userRepository.save(user);
        UserDto savedUserDto = modelMapper.map(savedUser,UserDto.class);
        return savedUserDto;
    }


    @Override
    public UserDto getUserById(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("User", "userId", id.toString()) );
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers(){
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = users
                                      .stream()
                                        .map((user)-> modelMapper.map(user,UserDto.class))
                                           .collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public UserDto updateUser(Long id , UserDto userDto){
        User user = userRepository.findById(id)
                             .orElseThrow(()-> new ResourceNotFoundException("User","userId",id.toString()));
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        User updatedUser = userRepository.save(user);
        UserDto updatedDto = modelMapper.map(updatedUser, UserDto.class)    ;
        return updatedDto;
    }

    @Override
    public void deleteUser(Long id){
        User user = userRepository.findById(id)
                              .orElseThrow(()-> new ResourceNotFoundException("User", "userId",id.toString()));
        userRepository.delete(user);
    }

}
