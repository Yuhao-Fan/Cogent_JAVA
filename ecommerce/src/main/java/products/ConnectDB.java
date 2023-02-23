package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	   static final String DB_URL = "jdbc:mysql://localhost/batch65";
	   static final String USER = "root";
	   static final String PASS = "fan990716";
	public static Connection connectSetup() {
		Connection conn = null;
	      try {
	    		
			 conn = DriverManager.getConnection(DB_URL, USER, PASS);

				

			} catch (SQLException e) {
				e.printStackTrace();
			}	
	     return conn;
	}

}
