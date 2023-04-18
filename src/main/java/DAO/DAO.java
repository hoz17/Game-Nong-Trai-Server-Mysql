package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    public static Connection conn;

    public DAO() {
        String jdbcURL = "jdbc:mysql://localhost:3306/gamenongtrai?useSSL=false";
        String jdbcUsername = "root";
        String jdbcPassword = ""; //please change information to connect to DB
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }


}
