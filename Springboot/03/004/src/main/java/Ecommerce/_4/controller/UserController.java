package Ecommerce._4.controller;

import Ecommerce._4.payload.UserDto;
import Ecommerce._4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;


    @PostMapping
    public ResponseEntity<UserDto> createUser( @RequestBody UserDto userDto ){
        UserDto createdDto = userService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDto);
    }

    @PostMapping ("/bulk")
    public ResponseEntity<List<UserDto>> createUsers(@RequestBody List<UserDto> users){
        List<UserDto> userDtos = userService.createUsers(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDtos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(
            @PathVariable("id") Long userId){
        UserDto userDto = userService.getUserById(userId);
        return ResponseEntity.ok().body(userDto);
    }



    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUser(){
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/sql")
    public ResponseEntity<List<UserDto>> getAllUsersSql(){
        List<UserDto> userDtos = userService.getAllUsersBeanPropertyRowMapper();
        return ResponseEntity.ok().body(userDtos);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(
           @PathVariable("id") Long userId,
           @RequestBody UserDto userDto
    ){
        UserDto updatedDto = userService.updateUser(userId,userDto);
        return ResponseEntity.ok().body(updatedDto);
    }


    @DeleteMapping ("/{id}")
    public ResponseEntity<String> deleteUser ( @PathVariable("id")  Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok("DEleted");
    }


}
