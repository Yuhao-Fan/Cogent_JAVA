package systematic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MethodsDef {
	public MethodsDef() {
		super();
		this.conn = ConnectDB.connectSetup();
	}
	Connection conn= null;
	void createData() throws SQLException {

		PreparedStatement stmt=conn.prepareStatement("insert into persons (PersonID,LastName) values(?,?)");  
		stmt.setInt(1,119);//1 specifies the first parameter in the query  
		stmt.setString(2,"Yuhao Fan");  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  

	}
	void readData() throws SQLException {

		PreparedStatement pstmt=conn.prepareStatement("select * from persons");  
		ResultSet rs = pstmt.executeQuery();
				
			while (rs.next()) {
					// Display values
					System.out.print("ID: " + rs.getInt("PersonID"));
					System.out.println(", Name: " + rs.getString("LastName"));
		  
			}


	}
	void updateData() throws SQLException {

		PreparedStatement stmt=conn.prepareStatement("insert into persons values(?,?,?,?,?)");  
		stmt.setInt(1,118);//1 specifies the first parameter in the query  
		stmt.setString(2,"Le Cai");  
		stmt.setString(3,"Le Cai");  
		stmt.setString(4,"Le Cai");  
		stmt.setString(5,"Le Cai");  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  

	}
	void deleteData() throws SQLException {
//  	DELETE FROM persons WHERE LastName='a';


		PreparedStatement stmt=conn.prepareStatement("DELETE FROM persons WHERE LastName=?;");  
		stmt.setString(1,"abhi");//1 specifies the first parameter in the query  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  


	}

}
