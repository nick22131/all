package com.example.spring_boot_ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:file:./data/userDB", "sa", "");

        }catch(ClassNotFoundException e) {
            throw new SQLException("H2 Driver not found", e);
        }
    }
}
