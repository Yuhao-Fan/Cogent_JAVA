<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import=" java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Display all Data from MySQL</h1>
	<div align="center">
	<%
//All JAVA code here to connect MySQL and Pull All REcords

	final String URL = "jdbc:mysql://localhost/batch65";
	final String USER = "root";
	final String PASSWORD = "fan990716";
	final String DRIVER = "com.mysql.cj.jdbc.Driver";
	Connection conn = null;
	try {
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	try {

		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h3>Persons Details</h3>");
		out.println("<table border=1><tr>" + "<td><b>ID</b></td>" + "<td><b>Names</b></td>");

	
		Statement stmt = conn.createStatement();
		String sql = "select * from persons;";
		ResultSet rs = stmt.executeQuery(sql);

	
		while (rs.next()) {
			int sno = rs.getInt("id");
			String brand = rs.getString("name");
			out.println("<tr>" + "<td>" + sno + "</td>" + "<td>" + brand + "</td>" );

		}
		out.println("</table></body></html>");
		rs.close();
		stmt.close();
		out.close();

	} catch (SQLException e) {
		e.printStackTrace();
	}

%>
</div>




</body>
</html>
