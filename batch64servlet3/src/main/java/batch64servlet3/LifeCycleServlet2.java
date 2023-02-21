package batch64servlet3;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
// importing the javax.servlet package
// importing java.io package for PrintWriter
import jakarta.servlet.annotation.WebServlet;


import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet("/lifecycle2")
public class LifeCycleServlet2 implements Servlet {

	ServletConfig config = null;
	Connection conn= null;
	// init method
	public void init(ServletConfig sc)
	{
		config = sc;
		this.conn = Connector.connectSetup();
		System.out.println("connectSetup");
		
	}

	// service method
	public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2>hello from life cycle servlet</h2>");
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("select * from Employer");
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
					// Display values
					int PersonID = rs.getInt("PersonID");
					String LastName = rs.getString("LastName");

	  
					pw.println("<tr>" + "<td>" + PersonID + "</td>" + "<td>" + LastName + "</td></tr>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		System.out.println("in service");
	}

	// destroy method
	public void destroy()
	{
		System.out.println("in destroy");
	}
	public String getServletInfo()
	{
		return "LifeCycleServlet2";
	}
	public ServletConfig getServletConfig()
	{
		return config; // getServletConfig
	}
}

