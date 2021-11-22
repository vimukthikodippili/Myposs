package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;
    private static DBConnection dbConnection;
    public DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/filmhall","root","1234");


    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        return  null== dbConnection ? dbConnection =new DBConnection():dbConnection;

    }
    public Connection getConnection(){
        return connection;

    }
}
