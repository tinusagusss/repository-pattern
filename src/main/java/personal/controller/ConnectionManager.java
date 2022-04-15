package personal.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author agus
 */
public class ConnectionManager {

    private Connection connection;
    private final String jdbcUrl = "jdbc:mysql://localhost:3306/tablelatihan";
    private final String user = "root";
    private final String password = "P@ssw0rd.01";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getCause());
        }
        return connection;
    }
}
