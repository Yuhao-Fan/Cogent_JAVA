package batch64servlet3;
// A servlet is annotated with only the URL pattern
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/Hi")
public class HiServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
//        
//        printWriter.println("      <body>\n"
//        		+ "        <div id=\"name\" style=\"color:yellow;\">\n"
//        		+ "          Amit\n"
//        		+ "        </div>\n"
//        		+ "      </body>");

        printWriter.println("<form name=\"loginForm\" method=\"post\" action=\"loginServlet\">\n"
        		+ "    Username: <input type=\"text\" name=\"username\"/> <br/>\n"
        		+ "    Password: <input type=\"password\" name=\"password\"/> <br/>\n"
        		+ "    <input type=\"submit\" value=\"Login\" />\n"
        		+ "</form>");
        printWriter.println("</html>");
//        printWriter.println("<input type=\"text\" name=\"LastName\"/>");

        
    }
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String PersonID = request.getParameter("PersonID");
        String LastName = request.getParameter("LastName");
         
        System.out.println("PersonID: " + PersonID);
        System.out.println("LastName: " + LastName);
 
        // do some processing here...
         
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
}

