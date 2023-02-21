package bank;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import batch64servlet3.Connector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ReadCustomer")
public class ReadCustomer extends HttpServlet {

	private static final long serialVersionUID = 1L;

	Connection conn = null;

	public void init() throws ServletException {

		// Database connection through Driver Manager

			try {
				this.conn = Connector.connectSetup();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
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
			out.println("<table border=1><tr>" + "<td><b>ID</b></td>" + "<td><b>Name</b></td>");

			// Create JDBC statement object, construct
			// the SQL query and execute the query.
			Statement stmt = conn.createStatement();
			String sql = "select * from persons;";
			ResultSet rs = stmt.executeQuery(sql);

			// Loop through the result set to
			// retrieve the individual data items.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");


				out.println("<tr>" + "<td>" + id + "</td>" + "<td>" + name + "</td>" );

			}
			
			out.println("</table>");
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
	
	public void destroy() {

		// Close connection object.
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

