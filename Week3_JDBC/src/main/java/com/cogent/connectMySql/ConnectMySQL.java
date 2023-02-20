package com.cogent.connectMySql;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {
   static final String DB_URL = "jdbc:mysql://localhost/testDB";
   static final String USER = "root";
   static final String PASS = "fan990716";
   static String QUERY = "SELECT * FROM Persons";

   public static void main(String[] args) {
      // Open a connection
      try(
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("PersonID"));
            System.out.println(", Name: " + rs.getString("LastName"));
           
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      
      try {
  		
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			QUERY="INSERT INTO persons (PersonID, LastName) VALUES (117, 'Abhi')"; //Statement Or Prepared Statement
			boolean rs = stmt.execute(QUERY);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}		
		//Insert Operation
		
      	try {
		
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//Statement stmt = conn.createStatement();
		//	QUERY="INSERT INTO persons (PersonID, LastName) VALUES (117, 'Abhi')"; //Statement Or Prepared Statement
			
			PreparedStatement stmt=conn.prepareStatement("insert into persons values(?,?,?,?,?)");  
			stmt.setInt(1,118);//1 specifies the first parameter in the query  
			stmt.setString(2,"Le Cai");  
			stmt.setString(3,"Le Cai");  
			stmt.setString(4,"Le Cai");  
			stmt.setString(5,"Le Cai");  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			
			//boolean rs = stmt.execute(QUERY);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
      	// update 
      	try {
    		
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//Statement stmt = conn.createStatement();
		//	QUERY="INSERT INTO persons (PersonID, LastName) VALUES (117, 'Abhi')"; //Statement Or Prepared Statement
			
			PreparedStatement stmt=conn.prepareStatement("UPDATE persons\n"
					+ "SET LastName = ?, City= ?\n"
					+ "WHERE PersonID = ?;");  
			stmt.setString(1,"fan");//1 specifies the first parameter in the query  
			stmt.setString(2,"qd");  
			stmt.setInt(3,111);  

			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");  
			
			//boolean rs = stmt.execute(QUERY);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//      	DELETE FROM persons WHERE LastName='a';
     // update 
      	try {
    		
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//Statement stmt = conn.createStatement();
		//	QUERY="INSERT INTO persons (PersonID, LastName) VALUES (117, 'Abhi')"; //Statement Or Prepared Statement
			
			PreparedStatement stmt=conn.prepareStatement("DELETE FROM persons WHERE LastName=?;");  
			stmt.setString(1,"abhi");//1 specifies the first parameter in the query  


			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");  
			
			//boolean rs = stmt.execute(QUERY);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	

   }
}

