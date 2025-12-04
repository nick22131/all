package com.example.spring_boot_ex5;

import com.example.spring_boot_ex5.User;
import com.example.spring_boot_ex5.UserDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController {
    //http
    @GetMapping(path = "/get-user-plain-jdbc")
    public String getUserPlainJDBC() {
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.createUserTable();
            userDAO.createUser("x", 25);
            userDAO.createUser("y", 30);

            List<User> users = userDAO.readUsers();

            // Print to console
            for (User user : users) {
                System.out.println("User: ID=" + user.getId() + ", Name=" + user.getName() + ", Age=" + user.getAge());
            }

            return "SUCCESS. Users count: " + users.size();
        } catch (SQLException e) {
            e.printStackTrace(); // Log exception to console
            return "ERROR: " + e.getMessage();
        }
    }
}
