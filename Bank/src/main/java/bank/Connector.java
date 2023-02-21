package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	   static final String DB_URL = "jdbc:mysql://localhost/batch65";
	   static final String USER = "root";
	   static final String PASS = "fan990716";
	   final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static Connection connectSetup() throws ClassNotFoundException {
		Connection conn = null;
	      try {
		    	 Class.forName(DRIVER);
				 conn = DriverManager.getConnection(DB_URL, USER, PASS);
				 System.out.println(conn.isValid(5));
				

			} catch (SQLException|ClassNotFoundException e) {
				e.printStackTrace();
			}	
	     return conn;
	}
}
