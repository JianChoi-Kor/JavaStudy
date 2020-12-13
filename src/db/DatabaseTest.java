package db;

public class DatabaseTest {

	public static void main(String[] args) {
		
		Connection con = DbUtils.getCon();
		
		DbUtils.close(con);
	}

}
