package jdbcTemp.jdbc_7Dec25.Repository;

import jdbcTemp.jdbc_7Dec25.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public void createUserTable(){
        String sql = """
                CREATE TABLE users(
                user_id INT AUTO_INCREMENT PRIMARY KEY,
                user_name VARCHAR(20),
                age INT (2))
                """ ;
        jdbcTemplate.execute(sql);
    }

    public void createUser(String userName, Integer age){
        String sql = "INSERT INTO users (user_name,age) VALUES (?,?)";
        jdbcTemplate.update(sql , userName, age);
    }

    public List<User> getUsers(){
        String sql = "SELECT * FROM users"  ;
        List<User> users = jdbcTemplate.query(sql ,(rs,rowNo)->{
            User user = new User();
            user.setUserName(rs.getString("user_name"));
            user.setUserId(rs.getInt("user_id"));
            user.setAge(rs.getInt("age"));
            return user;
        });
        return users;
    }
}
