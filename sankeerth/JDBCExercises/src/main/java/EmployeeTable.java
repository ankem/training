import sun.dc.pr.PRError;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTable {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/myDatabase";
    private static final String USER = "root";
    private static final String PASS = "sankeerth85";

    public static void createNewTable() {

        String sql = "CREATE TABLE IF NOT EXISTS Employees " +
                "(id INTEGER NOT NULL AUTO_INCREMENT , " +
                " firstname VARCHAR(255), " +
                " lastname VARCHAR(255), " +
                " age INTEGER, " +
                " gender VARCHAR(255), " +
                " salary VARCHAR(255), " +
                " department VARCHAR(255)," +
                "PRIMARY KEY(id))";

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insertRecord() {

        String sql = "INSERT INTO Employees(firstname,lastname,age,gender,salary,department) " +
                "VALUES ('Lakshma','Kollu',23,'F','45','Accounting')";

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void updateRecord(int i) {
        String sql = "UPDATE Employees set firstname='sankeerth' where id=" + i;

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void deleteRecord() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter employee id to delete");
        int n = input.nextInt();
        String sql = "delete from Employees where id=" + n;
        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readRecords() {

        String sql = "SELECT * from Employees ";

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                System.out.print("ID :" + rs.getInt(1));
                System.out.print(", firstname :" + rs.getString(2));
                System.out.print(", lastname :" + rs.getString(3));
                System.out.print(", age :" + rs.getInt(4));
                System.out.print(", gender :" + rs.getString(5));
                System.out.print(", salary:" + rs.getString(6));
                System.out.print(", department:" + rs.getString(7));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void highestsalaried() {
        String sql = "SELECT id, firstname, department, MAX(salary) FROM Employees GROUP BY department ";

        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                System.out.print(" id:" + rs.getString(1));
                System.out.print(", firstname:" + rs.getString(2));
                System.out.print(", department:" + rs.getString(3));
                System.out.print(", salary:" + rs.getString(4));

                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void numberOfBooksRead() {

        String sql = "select employees.firstname, books.employeeid, count(books.bookname) " +
                "from books inner join employees " +
                "ON employees.id = books.employeeid " +
                "group by employeeid " +
                "order by count(books.employeeid)";
        try (Connection conn = DriverManager.getConnection(url, USER, PASS);
             PreparedStatement s = conn.prepareStatement(sql)) {
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                System.out.print("First Name :" + rs.getString(1));
                System.out.print(", ID :" + rs.getInt(2));
                System.out.print(", count :" + rs.getInt(3));

                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static int[] runBatchOperation() {
        String insertSQL = "INSERT INTO Employees(id,firstname,lastname,age,gender,salary,department) " +
                "VALUES (?,?,?,?,?,?,?)";

        int[] count = {};
        try (Connection conn = DriverManager.getConnection(url, USER, PASS)) {

            PreparedStatement pstmt = conn.prepareStatement(insertSQL);

            // Set the variables
            pstmt.setInt(1,10);
            pstmt.setString(2, "Lakshma");
            pstmt.setString(3, "Peram");
            pstmt.setInt(4, 25);
            pstmt.setString(5,"male");
            pstmt.setInt(6,4000);
            pstmt.setString(7,"manufacturing");
            // Add it to the batch
            pstmt.addBatch();

            // Set the variables
            pstmt.setInt(1,11);
            pstmt.setString(2, "Rami");
            pstmt.setString(3, "Reddy");
            pstmt.setInt(4, 35);
            pstmt.setString(5,"male");
            pstmt.setInt(6,8000);
            pstmt.setString(7,"Sales");
            // Add it to the batch
            pstmt.addBatch();

            //Create an int[] to hold returned values
            count = pstmt.executeBatch();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        updateRecord();
    }
}
