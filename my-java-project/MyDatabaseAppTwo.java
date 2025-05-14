import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyDatabaseAppTwo {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM my_table"); // Change `my_table` to your table name

            while (resultSet.next()) {
                System.out.println("Data: " + resultSet.getString("column_name")); // Replace `column_name` with your actual column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

