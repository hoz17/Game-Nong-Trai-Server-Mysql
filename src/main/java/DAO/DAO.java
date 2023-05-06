package DAO;


import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public static Connection conn;

    public DAO() {
        String jdbcURL = "jdbc:mysql://localhost:3306/gamenongtrai?useSSL=false";
        String jdbcUsername = "root";
        String jdbcPassword = "S@obang2002"; //please change information to connect to DB
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }


}
