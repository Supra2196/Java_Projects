import java.sql.*;
import java.util.Scanner;

public class InsertFromUser {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/family?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "P@$$w0rd"; // update as needed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // 1. Take input from user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter SSN: ");
            String ssn = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            // 2. Create SQL with ? placeholders
            String sql = "INSERT INTO personal_info (SSN, name, email, age) VALUES (?, ?, ?, ?)";

            // 3. Use PreparedStatement to safely insert values
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ssn);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setInt(4, age);

            pstmt.executeUpdate();
            System.out.println("Insert successful");

            // 4. Close everything
            pstmt.close();
            conn.close();
            sc.close();

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
