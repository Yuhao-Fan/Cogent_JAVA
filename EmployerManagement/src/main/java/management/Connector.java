package management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	   static final String DB_URL = "jdbc:mysql://localhost/Management";
	   static final String USER = "root";
	   static final String PASS = "fan990716";
	public static Connection connectSetup() {
		Connection conn = null;
	      try {
	    		
			 conn = DriverManager.getConnection(DB_URL, USER, PASS);
			 System.out.println(conn.isValid(5));
				

			} catch (SQLException e) {
				e.printStackTrace();
			}	
	     return conn;
	}
}
