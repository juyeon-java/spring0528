package or.itschool.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class MysqlConnectTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/spring?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
	private static final String UID = "spring";
	private static final String UPW = "spring";
	
	@Test
	public void connectTest() throws Exception {
		Class.forName(DRIVER);
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, UID, UPW);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) con.close();
		}
	}
}
