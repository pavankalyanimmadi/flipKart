package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;

public class ConnectionFactory {
	private static Connection conn;
	
	public static Connection getConnection()throws Exception {
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");
		return conn;
	}
	
}
