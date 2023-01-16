import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("mysql://localhost:3306/newdb", "root", "Velletri98");

        Statement statement = connection.createStatement();

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT last_name, first_name\n" +
                "FROM newdb.students;\n");

        List <String> surnames = new ArrayList<>();

        while (rs.next()) {
            System.out.println("Name: " + rs.getString("first_name"));
            surnames.add(rs.getString("last_name"));
        }

        for (String surname : surnames) {
            System.out.println(surname);
        }
    }
}
