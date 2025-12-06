package jdbc.jpa.jdbc_6Dec25.repository;

import jdbc.jpa.jdbc_6Dec25.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public void createUserTable(){
        String sql = "CREATE TABLE users(" +
                      "user_id INT AUTO_INCREMENT PRIMARY KEY," +
                      "user_name VARCHAR(20 ),"+
                      "age INT(3))";

         jdbcTemplate.execute(sql);

    }

    public boolean createUser(String userName, Integer age){
        String sql = "INSERT INTO users (user_name , age) VALUES(?,?)";
        boolean inserted = false;
        int rowAffected = jdbcTemplate.update(sql,userName,age);
        if(rowAffected != 0 ){
            inserted = true;
        }
        return inserted;
    }

    public List<User> getUsers(){
        String sql = "SELECT * FROM users"  ;
        List<User> users = jdbcTemplate.query(sql , (rs,rowNum)-> {
            User user = new User();
            user.setUserName(rs.getString("user_name"));
            user.setUserId(rs.getInt("user_id"));
            user.setAge(rs.getInt("age"));
            return user;
        });
        return users;
    }

}
