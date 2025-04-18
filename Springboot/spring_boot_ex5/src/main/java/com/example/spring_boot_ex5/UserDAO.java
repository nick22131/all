package com.example.spring_boot_ex5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public void createUserTable () throws SQLException {
        Connection connection = null;
        Statement statement = null ;
        try{
            connection = new DatabaseConnection().getConnection();
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS user (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT)";
            statement.execute(sql);
        }finally{
            if(statement != null) statement.close();
            if(connection != null) connection.close();
        }
    }

    public void createUser(String userName, int userAge) throws SQLException{
        Connection connection = null;
        PreparedStatement   preparedStatement = null ;
        try{
            connection = new DatabaseConnection().getConnection();

            String sql = "INSERT INTO users(name, age) VALUES(?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setInt(2,userAge);
            preparedStatement.executeUpdate();
        }finally{
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }


    public List<User> readUsers() throws SQLException{
        List<User> users = new ArrayList<>();
        Connection connection = null;
        PreparedStatement   preparedStatement = null ;
        ResultSet resultSet = null;
        try{
            connection = new DatabaseConnection().getConnection();
            String sql = "SELECT * FROM users";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                users.add(user);
            }

        }finally {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return users;
    }
}
