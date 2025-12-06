package jdbc.jpa.jdbc_6Dec25_02.service;

import jdbc.jpa.jdbc_6Dec25_02.entity.User;
import jdbc.jpa.jdbc_6Dec25_02.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {
    private final UserRepository userRepository;

    public void createUserTable(){
        userRepository.createUserTable();
    }

    public void createUser(String userName,Integer age){
        userRepository.createUser(userName,age);
    }

    public void readUser(){
        List<User> users = userRepository.getUsers();
        for(User user : users){
            System.out.println(user.getUserId() + " : " + user.getUserName() + " - " + user.getAge() );

        }

    }
}
