package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/library1";
		String user = "root";
		String password = "290204";
	
	
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
		System.out.println("Kết nối cơ sở dữ liệu thành công!");
		} catch (SQLException e) {
		System.out.println("Kết nối cơ sở dữ liệu thất bại!");
		e.printStackTrace();
		}
	}
}
