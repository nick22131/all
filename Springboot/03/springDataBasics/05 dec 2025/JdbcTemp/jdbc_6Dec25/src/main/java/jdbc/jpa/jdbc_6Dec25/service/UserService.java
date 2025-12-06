package jdbc.jpa.jdbc_6Dec25.service;

import jdbc.jpa.jdbc_6Dec25.entity.User;
import jdbc.jpa.jdbc_6Dec25.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createTable(){
        userRepository.createUserTable();
    }

    public void insertUser(String name,Integer age){
        userRepository.createUser(name, age);
    }

    public List<User> getUsers(){
        List<User> users = userRepository.getUsers();
        for(User user : users){
            System.out.println(user.getUserId()+ " : " + user.getUserName() +" : "+ user.getAge());
        }
        return users;
    }

}
