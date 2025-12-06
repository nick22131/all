import java.sql.*;

public class JdbcPlain01 {

        private static Connection getConnection() {

        try {
            Class.forName(DBConfig.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(
                    DBConfig.URL.getValue(),
                    DBConfig.USER.getValue(),
                    DBConfig.PASS.getValue()
            );
            return connection;
        }catch (ClassNotFoundException | SQLException e ){
            e.printStackTrace();
        }
        return null;
        }

        private static void createUserTable(){
            String sql = "CREATE TABLE IF NOT EXISTS users01("+
                          "user_id INT AUTO_INCREMENT PRIMARY KEY,"+
                           "user_name VARCHAR(30)," +
                            "age INT(3))";
            try(Connection con = getConnection();
                Statement statement = con.createStatement()){
                statement.executeUpdate(sql);
                System.out.print("\n Table users01 created");
            }catch(SQLException e ){
                e.printStackTrace();
            }
        }

        private static void createUser(String userName, int age) {
            String sql = "INSERT INTO users01 (user_name, age) VALUES (?,?)";
            boolean created = false;
            try (Connection con = getConnection();
                 PreparedStatement pst = con.prepareStatement(sql)  ){
                pst.setString(1,userName);
                pst.setInt(2,age);
               int rowAffected =  pst.executeUpdate();
               if(rowAffected != 0){
                   created = true;
               }
                System.out.print("\n User Table created " + created);
            }catch(SQLException e ){
                e.printStackTrace();
            }
        }

        private static void readUsers(){
            String sql = "SELECT * FROM users01";
            try(Connection con =  getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery() ){
                while(rs.next()){
                    int id = rs.getInt("user_id");
                    String name = rs.getString("user_name");
                    int age = rs.getInt("age");
                    System.out.println(id + " : " + name + " - " + age) ;
                }

            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        private static void updateUser(String userName, int age){
         String sql = "UPDATE user01 SET age = ? WHERE user_name = ?  ";
         boolean updated = false;
         try(Connection con = getConnection();
              PreparedStatement pst = con.prepareStatement(sql)){
             pst.setInt(1,age);
             pst.setString(2,userName);
             int rowAffected = pst.executeUpdate();
             if(rowAffected != 0){
                 updated = true;
             }
             System.out.print("\n updated :" + updated);

         }catch(SQLException e ){
             e.printStackTrace();
         }
        }

        private static void deleteUser(String userName){
            String sql = "DELETE FROM users01 WHERE user_name = ?";
            boolean deleted = false;
            try(Connection con = getConnection();
                 PreparedStatement pst = con.prepareStatement(sql)) {
                int rowAffected = pst.executeUpdate();
                if(rowAffected != 0){
                    deleted = true;
                }
                System.out.print("deleted : " + true)   ;

            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        public static void main (String[] args){
            createUserTable();

            createUser("alice",15);
            createUser("jost",25);
            createUser("molu",35);
            System.out.println("all users : " );
            readUsers();
        }
}
