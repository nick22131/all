package jdbc;

import java.sql.*;

public class UserDAO {

    public void createUserTable(){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = new DatabaseConnection().getConnection();
            statement = connection.createStatement();
            String sql = "CREATE TABLE users(" +
                    "user_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "user_name VARCHAR(100)," +
                    "age INT ) ";
            statement.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if(connection!= null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement != null ){
                try{
                    statement.close();
                }catch(SQLException e ){
                    e.printStackTrace();
                }
            }
        }
    }


    public void createUser(String userName, int userAge)   {
        Connection connection = null;
        PreparedStatement pStatement = null;
        try{
            connection = new DatabaseConnection().getConnection();
            String sql = "INSERT INTO users(user_name,age)" +
                    "VALUES (?,?)";
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1,userName);
            pStatement.setInt(2,userAge);
            pStatement.executeUpdate();
        }catch(SQLException e ){
            e.printStackTrace();
        }
        finally{
            if(connection != null ){
                try{
                    connection.close();
                }catch(SQLException e ) {
                    e.printStackTrace();
                }
            }
            if(pStatement != null){
                try{
                    pStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }


    public void readUser(){
        Connection connection = null;
        PreparedStatement pStatement = null;
        ResultSet output = null;
        try {
            connection = new DatabaseConnection().getConnection();
            String sql = "SELECT * FROM users";
            pStatement = connection.prepareStatement(sql);
            output = pStatement.executeQuery();
            while (output.next()) {
                String userDetails = output.getInt("user_id") + " : " + output.getString("user_name") +
                        " - " + output.getInt("age");
                System.out.println(userDetails);
            }
        }catch(SQLException e){
            e.printStackTrace();

            }finally{
            if(connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(pStatement != null){
                try{
                    pStatement.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }

}
