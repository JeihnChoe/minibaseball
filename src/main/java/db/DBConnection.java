package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getInstance() {
        //MySQL 연결정보
        String url = "jdbc:mysql://localhost:3306/baseball";
        String username = "root";
        String password = "root1234";

        //JDBC 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}