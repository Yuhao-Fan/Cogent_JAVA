package products;
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
 
@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	Connection conn = null;

	public void init() throws ServletException {

		this.conn = ConnectDB.connectSetup();

	}

	
	
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
    	response.setContentType("text/html");
    	//((ServletResponse) request).setContentType("text/html");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String cost = request.getParameter("cost");
        String discount = request.getParameter("discount");
        String available = request.getParameter("available");
        String sold = request.getParameter("sold");
         
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
   
		PreparedStatement stmt=conn.prepareStatement("insert into products (id,name,cost,discount,available,sold) values(?,?,?,?,?,?)");  
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
