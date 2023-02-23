package com.cogent.systematic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class BusinessMethods {
	public BusinessMethods() {
		super();
		this.conn = ConnectDB.connectSetup();
	}
	Connection conn= null;
	void addEmp() throws SQLException {

		PreparedStatement pstmt=conn.prepareStatement("insert into Employer (PersonID,LastName) values(?,?)");  
		pstmt.setInt(1,001);//1 specifies the first parameter in the query  
		pstmt.setString(2,"Yuhao Fan");  
		int i=pstmt.executeUpdate();  
		System.out.println(i+" records inserted");  

	}
	void readEmp() throws SQLException {

		PreparedStatement pstmt=conn.prepareStatement("select * from Employer");  
		ResultSet rs = pstmt.executeQuery();
				
			while (rs.next()) {
					// Display values
					System.out.print("ID: " + rs.getInt("PersonID"));
					System.out.println(", Name: " + rs.getString("LastName"));
		  
			}


	}
	void updateEmp() throws SQLException {

		PreparedStatement stmt=conn.prepareStatement("insert into Employer values(?,?)");  
		stmt.setInt(1,002);//1 specifies the first parameter in the query  
		stmt.setString(2,"wasfhco");  
 
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");

	}
	void deleteEmp() throws SQLException {


		PreparedStatement stmt=conn.prepareStatement("DELETE FROM Employer WHERE LastName=?;");  
		stmt.setString(1,"Yuhao Fan");//1 specifies the first parameter in the query  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");


	}

}
