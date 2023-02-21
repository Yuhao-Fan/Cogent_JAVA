package jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	final String URL = "jdbc:mysql://localhost/Management";
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

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			// Set the response content type and
			// get the PrintWriter object.
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			// Set up HTML table formatting for the output
			out.println("<html><body>");
			out.println("<h3>Persons Details</h3>");
			out.println("<table border=1><tr>" + "<td><b>ID</b></td>" + "<td><b>Names</b></td>");

			// Create JDBC statement object, construct
			// the SQL query and execute the query.
			Statement stmt = conn.createStatement();
			String sql = "select * from Employer;";
			ResultSet rs = stmt.executeQuery(sql);

			// Loop through the result set to
			// retrieve the individual data items.
			while (rs.next()) {
				int sno = rs.getInt("PersonID");
				String brand = rs.getString("LastName");


				out.println("<tr>" + "<td>" + sno + "</td>" + "<td>" + brand + "</td>" );

			}
			
			out.println("</table>");
//			out.println("<form name=\"insertForm\" method=\"post\" action=\"fetch\">\n"
//    		+ "    PersonID: <input type=\"text\" name=\"PersonID\"/> <br/>\n"
//    		+ "    LastName: <input type=\"text\" name=\"LastName\"/> <br/>\n"
//    		+ "    <input type=\"submit\" value=\"Login\" />\n"
//    		+ "</form>");
			out.println("</body></html>");

			// Close Result set, Statement
			// and PrintWriter objects.
			rs.close();
			stmt.close();
			out.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        int PersonID = Integer.parseInt(request.getParameter("PersonID"));
        String LastName = request.getParameter("LastName");
         
        System.out.println("PersonID: " + PersonID);
        System.out.println("LastName: " + LastName);
 
        // do some processing here...
        PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("insert into Employer (PersonID,LastName) values(?,?)");
			pstmt.setInt(1,PersonID);//1 specifies the first parameter in the query  
			pstmt.setString(2,LastName);  
			int i=pstmt.executeUpdate();  
			System.out.println(i+" records inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
  
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your PersonID is: " + PersonID + "<br/>";      
        htmlRespone += "Your LastName is: " + LastName + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
         
    }

	public void destroy() {

		// Close connection object.
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

