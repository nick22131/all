import java.nio.channels.ScatteringByteChannel;
import java.sql.*;

public class JdbcPlain {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb01";
    private static final String USER = "root";
    private static final String PASS = "1515";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static void createUserTable() {

        String sql = "CREATE TABLE IF NOT EXISTS  users(" +
                "user_id INT AUTO_INCREMENT PRIMARY KEY," +
                "user_name VARCHAR(20)," +
                "age INT )";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.print("\n user table created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createUser(String userName, int age) {
        String sql = "INSERT INTO users(user_name,age) VALUES (?,?)";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1,userName);
            ps.setInt(2,age);
            ps.executeUpdate();
            System.out.print("\n user inserted : " + userName);

        }
    catch(SQLException e){
        e.printStackTrace();
    }
    }

    private static void readUsers(){
        String sql = "SELECT * FROM users";
        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery()){
            while(rs.next()){
                int id = rs.getInt("user_id");
                String name = rs.getString("user_name");
                int age = rs.getInt("age");
                System.out.println(id  + " : " + name + " - " + age);
            }
        }catch(SQLException e ){
         e.printStackTrace();
        }
    }

    private static void updateUserAge(String userName, int age){
        String sql = "UPDATE users SET age = ? WHERE user_name = ?"  ;

        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql)){

            pst.setInt(1,age);
            pst.setString(2,userName)  ;
            int rowAffected = pst.executeUpdate();
            System.out.print("\n " + rowAffected + " user updated");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private static void deleteUser(String userName){
        String sql = "DELETE FORM users WHERE user_name = ? "   ;
        try (Connection connection = getConnection();
             PreparedStatement pst = connection.prepareStatement(sql)){
            pst.setString(1,userName);
            int rowAffected = pst.executeUpdate();
            System.out.print("\n " + rowAffected + " deleted");
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args ){
        createUserTable();

        createUser("alice", 25);
        createUser("golu", 35);
        createUser("molue", 22);

        System.out.print("\n read all user: ");
        readUsers();
    }

}
