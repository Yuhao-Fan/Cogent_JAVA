package bank;
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
 
@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	
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

	
	
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
    	response.setContentType("text/html");
    	//((ServletResponse) request).setContentType("text/html");
//        String id = request.getParameter("id");
        String deletename = request.getParameter("deletename");
         
//        System.out.println("username: " + id);
        System.out.println("id: " + deletename);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
//        htmlRespone += "<h2>Delete id is: " + id + "<br/>";      
        htmlRespone += "<h2>DElete name is: " + deletename + "</h2>";    
        
        
        //////////////////logic to add to database //////
        try {
   
    		PreparedStatement stmt=conn.prepareStatement("DELETE FROM persons WHERE name=?;");  
    		stmt.setString(1,deletename);//1 specifies the first parameter in the query  
    		int i=stmt.executeUpdate();  
    		System.out.println(i+" records deleted");
    		htmlRespone += "<h2>"+i+" records deleted" + "</h2>";    
        }catch(Exception e) {
        	System.out.println("something Wrong");
        }
        /////////////////////////////////////////////////
        htmlRespone += "</html>";
        // return response
        writer.println(htmlRespone);
         
    }
 
}
