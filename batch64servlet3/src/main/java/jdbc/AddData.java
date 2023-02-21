package jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/addpost")
public class AddData extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	final String URL = "jdbc:mysql://localhost/batch65";
	final String USER = "root";
	final String PASSWORD = "fan990716";
	final String DRIVER = "com.mysql.cj.jdbc.Driver";
	Connection conn = null;

	public void init() throws ServletException {

		// Database connection through Driver Manager
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	
	
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
    	response.setContentType("text/html");
    	//((ServletResponse) request).setContentType("text/html");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
         
        System.out.println("username: " + id);
        System.out.println("password: " + name);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + id + "<br/>";      
        htmlRespone += "Your password is: " + name + "</h2>";    
        htmlRespone += "</html>";
        
        //////////////////logic to add to database //////
        try {
   
		PreparedStatement stmt=conn.prepareStatement("insert into persons values(?,?)");  
		stmt.setInt(1,Integer.parseInt(id));//1 specifies the first parameter in the query  
		stmt.setString(2,name);  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
        }catch(Exception e) {
        	System.out.println("something Wrong");
        }
        /////////////////////////////////////////////////
        
        // return response
        writer.println(htmlRespone);
         
    }
 
}
