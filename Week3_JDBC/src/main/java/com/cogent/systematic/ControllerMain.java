package com.cogent.systematic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerMain {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=conn.prepareStatement("select * from Employer");  
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			// Display values
			System.out.print("ID: " + rs.getInt("PersonID"));
			System.out.println(", Name: " + rs.getString("LastName"));
			
			personBucket.add(new Persons(rs.getInt("PersonID"),rs.getString("LastName")));
			//Collection 
			     //to manipulate -- Stream API -- Optional
			System.out.println("Records are now in Collection");
			System.out.println(personBucket);
			System.out.println(":::::::::::::::::::");
			personBucket.stream().limit(3).forEach(System.out::println);
			
  
	}


	}

}
