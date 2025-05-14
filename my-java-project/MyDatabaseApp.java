import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabaseApp {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root"; // use your database username
        String password = "password"; // use your database password

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection established!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

