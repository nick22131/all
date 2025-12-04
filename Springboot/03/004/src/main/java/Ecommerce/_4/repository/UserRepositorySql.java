package Ecommerce._4.repository;

import Ecommerce._4.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class UserRepositorySql {

    private final JdbcTemplate jdbcTemplate;

    public List<User> getAllUsers(){
        String sql = "SELECT * FROM user" ;
        var rowMapper = BeanPropertyRowMapper.newInstance(User.class);
        List<User> users = jdbcTemplate.query(sql,rowMapper);
        return users;
    }
}
