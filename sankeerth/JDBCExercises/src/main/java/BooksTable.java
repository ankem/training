import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BooksTable {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/myDatabase";

    static final String USER = "root";
    static final String PASS = "sankeerth85";

    public static void createNewTable() throws ClassNotFoundException {

        String sql = "CREATE TABLE IF NOT EXISTS Books " +
                "(bookname VARCHAR(255), " +
                " author VARCHAR(255), " +
                " employeeid INTEGER Not null, " +
                "FOREIGN KEY(employeeid) references Employees(id))";

        try (Connection conn = DriverManager.getConnection(url,USER,PASS);
             Statement s = conn.prepareStatement(sql)) {
            s.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insertBook(){
        String sql = "INSERT INTO Books " +
                "VALUES ('c language','master','2')";

        try (Connection conn = DriverManager.getConnection(url,USER,PASS);
             Statement s = conn.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        insertBook();
    }
}
