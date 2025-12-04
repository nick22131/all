package JdbcTemplete.JdbcTemplete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createTable(){
        String sql = "CREATE TABLE users(" +
                "user_id INT AUTO_INCREMENT PRIMARY KEY," +
                "user_name VARCHAR(30)," +
                "age INT );";
        jdbcTemplate.execute(sql);
    }

    public void addUsers(String userName, Integer age){
        String sql = "INSERT INTO users(user_name, age) VALUES (?,?); ";
        int rowAffected = jdbcTemplate.update(sql, userName, age );
    }

    public void updateUserAge(int userId, int age){
        String sql = "UPDATE users SET age = ? WHERE user_name = ?;";
        int rowAffected = jdbcTemplate.update(sql,age,userId);
    }

}
