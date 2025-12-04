package spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.model.User;
import spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.service.UserService;

import java.util.List;
//http://localhost:8080/users
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
  //http://localhost:8080/users/create-table
    @PostMapping("/create-table")
    public String createTable() {
        userService.createTable();
        return "User table created.";
    }
     //http://localhost:8080/users/add
    @PostMapping("/add")
    public String addUser(@RequestParam String name, @RequestParam int age) {
        userService.insertUser(name, age);
        return "User added.";
    }
   //http://localhost:8080/users/all
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }
}
