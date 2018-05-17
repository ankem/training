import java.sql.*;

public class BooksTable {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/myDatabase";

    private static final String USER = System.getenv("MYSQL_USERNAME");
    private static final String PASS = System.getenv("MYSQL_PASSWORD");

    public static void createNewTable() {

        String sql = "CREATE TABLE Books " +
                "(bookname VARCHAR(255), " +
                " author VARCHAR(255), " +
                " description VARCHAR(255), " +
                " employeeid INTEGER Not null, " +
                "FOREIGN KEY(employeeid) references Employees(id))";

        String alterTableSQL = "ALTER TABLE Books ADD COLUMN description VARCHAR(255) AFTER employeeid";

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try (Connection conn1 = DriverManager.getConnection(url, USER, PASS);
                 PreparedStatement s = conn1.prepareStatement(alterTableSQL)) {
                s.execute();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void insertBook() {
        String sql = "INSERT INTO Books " +
                "VALUES ('c language','master','2')";

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             Statement s = conn.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        createNewTable();
    }
}
