package db;

import java.sql.DriverManager;

public class DbUtils {
	
	public static Connection getCon() {
		Connection con = null;
		
		final String URL = "jdbc:mysql://localhost:3306/test";
		final String USER = "root";
		final String PW = "koreait2020";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);
			System.out.println("접속완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
