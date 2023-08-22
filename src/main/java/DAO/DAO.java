package DAO;


import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public static Connection conn;

    public DAO() {
        String jdbcURL = "jdbc_url";
        String jdbcUsername = "username";
        String jdbcPassword = "password"; //please change information to connect to DB
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }


}
