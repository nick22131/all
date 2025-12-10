package jdbcTemp.jdbc_7Dec25.service;

import jdbcTemp.jdbc_7Dec25.Repository.UserRepository;
import jdbcTemp.jdbc_7Dec25.entity.User;
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

    public void createUser(String userName, Integer age){
         userRepository.createUser(userName,age);
    }

    public void readUsers(){
        List<User> users = userRepository.getUsers();
        for(User user : users){
            System.out.print(user.getUserId() +  " - " + user.getUserName() +
                    " : " + user.getAge());
        }
    }
}
