package spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.model.User;
import spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.repository.UserRepository;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createTable() {
        userRepository.createTable();
    }

    public void insertUser(String userName, int age) {
        userRepository.insertUser(userName, age);
    }

    public List<User> getUsers() {
        List<User> users = userRepository.getUsers();
        users.forEach(user -> System.out.println(user.getUserId() + ":" +
                user.getUserName() + ":" +
                user.getAge()));
        return users;
    }
}


