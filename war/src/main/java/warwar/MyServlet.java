package warwar;
// A servlet is annotated with only the URL pattern
import java.io.IOException;
 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
//@WebServlet("/processForm")
public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println("Hello");
    }
}

